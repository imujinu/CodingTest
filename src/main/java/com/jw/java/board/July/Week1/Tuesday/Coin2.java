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
        dp[0] = 0;
        Arrays.fill(dp,-1);
        for(int i=1; i<=M; i++){
            int temp = Integer.MAX_VALUE;
            for(int a : wallet ){
                if(i-a>=0 && temp>dp[i-a]){
                    if(dp[i-a]==-1){
                     temp = -1;
                    }else{

                    temp = dp[i-a];
                    }
                }
            }

            if(temp==-1)dp[i] =-1;
            else{
                dp[i] = temp+1;
            }

        }


        System.out.println(dp[M]);
    }
}
