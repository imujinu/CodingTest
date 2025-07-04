package com.jw.java.board.July.Week1.Friday;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Expired {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] day = new int[N+1];
        int[] cost = new int[N+1];
        int[] dp = new int[N+2];
        for(int i=1; i<=N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int temp1= Integer.parseInt(st.nextToken());
        int temp2= Integer.parseInt(st.nextToken());
        day[i] = temp1;
        cost[i] = temp2;
        }

        for(int i=1; i<=N; i++){
            if(i+day[i]<N+2){
                dp[i+day[i]] = Math.max(dp[i+day[i]],dp[i]+cost[i]);
            }
            dp[i+1] = Math.max(dp[i],dp[i+1]);
        }

        int max = 0;
        System.out.println(Arrays.toString(dp));
        for(int i : dp){
            max=Math.max(max,i);
        }

        System.out.println(max);

    }
}
