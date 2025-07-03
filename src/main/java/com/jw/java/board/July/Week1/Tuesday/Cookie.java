package com.jw.java.board.July.Week1.Tuesday;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Cookie {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int left = 1;
        int right = arr[arr.length-1];
        int result =0;
        while(left<=right){
            int mid = (left+right)/2;
            int count =0 ;

            for(int i : arr){
                if(i/mid>0){
                    count+=i/mid;
                }
            }

            if(count>=N){
                left=mid+1;
                result=mid;
            }
            else{
                right=mid-1;
            }
        }
        bw.write(String.valueOf(result));
        bw.close();


    }
}
