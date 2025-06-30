package com.jw.java.board.June.TwentySeven;

import java.io.*;
import java.util.StringTokenizer;

public class Bag2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] weight = new int[M+1];
        int[] value = new int[M+1];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int tempWeight = Integer.parseInt(st.nextToken());
            int tempValue = Integer.parseInt(st.nextToken());
            weight[i] = tempWeight;
            value[i] = tempValue;
        }

        int[] dp = new int[M+1];

        for(int i=0; i<N; i++){
            for(int j=M; j-weight[i]>=0; j--){
                dp[j] = Math.max(dp[j], dp[j-weight[i]]+value[i]);
            }
        }
        int max = 0;

        for(int i : dp){
            max = Math.max(i,max);
        }

        bw.write(String.valueOf(max));
        bw.close();

    }
}
