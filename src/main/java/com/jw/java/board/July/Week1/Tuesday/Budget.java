package com.jw.java.board.July.Week1.Tuesday;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Budget {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int sum =0;
        int max = 0;
        StringTokenizer st  =new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
            sum+=temp;
            max=Math.max(max,temp);
        }
        int money = Integer.parseInt(br.readLine());
        if(money>sum){
            bw.write(String.valueOf(max));
        }
        else{
            Arrays.sort(arr);
            int left = 1;
            int right = max;
            int result=0;
            while(left<=right){
                int mid = (left+right)/2;
                int temp = 0;

                for(int i : arr){
                  if(i>mid) {
                      temp+=mid;
                  }
                  else{
                      temp+=i;
                  }
                }
                if(temp<=money){
                    result=mid;
                    left=mid+1;

                }
                else{
                  right=mid-1;
                }
            }
            bw.write(String.valueOf(result));
        }

        bw.close();


    }
}
