package com.jw.java.board.June.TwentThree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bag {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] dp = new int[M+1];
        int[] arr = new int[M+1];
        for(int i=0 ; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            arr[weight] = value;
        }

        for(int i=1; i<=M; i++){
            for(int j=M-i; j>0; j--){
                dp[i+j] = Math.max(arr[i]+arr[j], arr[i+j]);
            }
        }

        bw.write(String.valueOf(arr[M]));
        bw.close();

    }
}
