package com.jw.java.board.July.Week1.Tuesday;

import java.io.*;
import java.util.StringTokenizer;

public class Hotel {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] dp = new int[100001];
        int[] cost = new int[M];
        int[] visitor = new int[M];
        for(int i=0; i<M; i++){
             st = new StringTokenizer(br.readLine());
            cost[i] = Integer.parseInt(st.nextToken());
            visitor[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = 0;
        //dp = n원을 썼을 때 홍보를 몇 명 에게 할 수 있는가.

        for(int i=1 ; i<dp.length; i++){
            for(int j=0; j<M; j++){
                if(i-cost[j]>=0){
                   dp[i]=Math.max(dp[i],dp[i-cost[j]]+visitor[j]);
                   // dp[1] = d[1-1] + coist[j]
                }
            }
        }

        int idx =Integer.MAX_VALUE ;
        for(int i=0; i<dp.length; i++){
            if(dp[i]>=N) {
                idx=Math.min(idx,i);
            }
        }

        bw.write(String.valueOf(idx));
        bw.close();
    }
}
