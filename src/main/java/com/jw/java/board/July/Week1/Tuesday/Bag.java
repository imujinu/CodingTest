package com.jw.java.board.July.Week1.Tuesday;

import java.io.*;
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

        for(int i=0; i<N; i++){
            //중복처리 어떻게?
            // 무조건 그 무게값보다 작으면 사용 X
            //4 면 1,2,3 사용
            for(int j=M; j>=W[i]; j--){
                if(M-W[i]>=0){
                dp[j] =Math.max(dp[j],dp[M-W[i]] + V[i]) ;
                }
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i=1; i<=M; i++){
            max = Math.max(max,dp[i]);
        }

        System.out.println(max);


    }
}
