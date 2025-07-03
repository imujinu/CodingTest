package com.jw.java.board.July.Week1.Tuesday;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Two {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st  = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        int min = Integer.MAX_VALUE;
        int[] result= new int[2];

        while (left<right){
            int tempL = Math.abs(arr[left]);
            int tempR = Math.abs(arr[right]);
            int mid = (Math.abs(arr[left]+arr[right]));

            if(mid<min){
                min=mid;
                result[0]=arr[left];
                result[1] =arr[right];
            }


            if(mid>=0){
                if(tempL>tempR){
                    left++;
                }else{
                    right--;
                }
            }

        }

        bw.write(String.valueOf(result[0])+" "+String.valueOf(result[1]));
        bw.close();
    }
}
