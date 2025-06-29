package com.jw.java.board.June.TwentySeven;

import java.io.*;
import java.util.*;

public class City {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] cost = new int[M];
        int[] visit = new int[M];
        int[] dp = new int[2501];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int temp1 = Integer.parseInt(st.nextToken());
            int temp2 = Integer.parseInt(st.nextToken());
            cost[i] = temp1;
            visit[i] = temp2;
        }
        dp[0] = 0;
        for(int i=0; i<M; i++){
            for(int j=visit[i]; j<dp.length ; j++){
                if(dp[j-visit[i]]!=Integer.MAX_VALUE){

                dp[j]=Math.min(dp[j-visit[i]]+cost[i],dp[j]);
                }
            }
        }
        //i == 1  dp[5] dp[6] dp [7] ... dp[12]
        //dp는 N명을 유치하는데 들어간느 최소 비용
        // 아 그러면 사실 13명을 유치하는데 비용이 더 작을 수도 있음.
        int answer = Integer.MAX_VALUE;

        for(int i=N; i<dp.length; i++){
            answer = Math.min(answer,dp[i]);
        }

        bw.write(String.valueOf(answer));
        bw.close();

    }
}
