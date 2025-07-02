package com.jw.java.board.July.Week1.Tuesday;

import java.io.*;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Coin2 {
    static int N,M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[] wallet = new int[N];

        for(int i=0; i<N; i++){
            wallet[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[M+1];
        Arrays.fill(dp,-1);
        dp[0] =0;

        for(int i=1; i<=M; i++){
            int min = Integer.MAX_VALUE;
            for(int a : wallet){
                if(i-a>=0 && min>dp[i-a] && dp[i-a]!=-1){
                    min = Math.min(min,dp[i-a]);
                }
            }
            if(min!=Integer.MAX_VALUE) dp[i] = min+1;
        }


        System.out.println(dp[M]);
    }
}
