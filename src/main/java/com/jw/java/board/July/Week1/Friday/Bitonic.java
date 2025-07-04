package com.jw.java.board.July.Week1.Friday;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bitonic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st =new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        int[] dp1 = new int[N];
        int[] dp2 = new int[N];

        for(int i=0; i<N; i++){
            dp1[i] = 1;
            for(int j=0; j<i; j++){
                if(arr[i]>arr[j]){
                    dp1[i] = Math.max(dp1[i], dp1[j]+1);
                }
            }
        }

        for(int i=N-1; i>=0; i--){
            dp2[i] = 1;
            for(int j=N-1; j>i; j--){
                if(arr[i]>arr[j]){
                    dp2[i] = Math.max(dp2[i],dp2[j]+1);
                }
            }
        }

        int max = 0;

        for(int i=0; i<N; i++){
            int temp = dp1[i] + dp2[i];
            max=Math.max(max,temp);
        }

        bw.write(String.valueOf(max-1));
        //중복 제외
        bw.close();

    }
}
