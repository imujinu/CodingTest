package com.jw.java.board.July.Week1.Tuesday;

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Bag {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] W = new int[N];
        int[] V = new int[N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[M+1];
        dp[0] = 0;

        for(int i=M; i>=0; i--){
            for(int j=0; j<N; j++){
                    if(i-W[j]>=0){
                        dp[i] = Math.max(dp[i],dp[i-W[j]]+V[j]);
                    }
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i=1; i<=M; i++){
            max = Math.max(max,dp[i]);
        }
        for(int i : dp){
            System.out.println(i);
        }
        System.out.println(max);


    }
}