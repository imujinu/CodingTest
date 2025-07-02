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

            for(int j=M; j>=W[i]; j--){
                    dp[j]= Math.max(dp[j], dp[j-W[i]] + V[i]);
                    //W[i] ==3 dp3까지 값이 채워짐
                    // j==3 dp[0] + V[3]
                    // j==4 dp[1] + V[3]
                    // j==5 dp[2] + V[3]
                    // j==6 dp[3] + V[3]
                    // j==7 dp[4] +V[3] dp 값이 0인데?
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i=1; i<=M; i++){
            max = Math.max(max,dp[i]);
        }

        System.out.println(max);


    }
}
