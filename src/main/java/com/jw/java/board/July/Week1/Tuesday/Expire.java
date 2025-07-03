package com.jw.java.board.July.Week1.Tuesday;

import java.io.*;
import java.util.*;

public class Expire {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] day= new int[N+1];
        int[] cost= new int[N+1];
        int[] dp = new int[N+2];
        dp[0] = 0;
        for(int i=1; i<=N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            day[i] = Integer.parseInt(st.nextToken());
            cost[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=N+1; i>=1; i--){

        }

        for(int i :dp){
            System.out.println(i);
        }


    }
}
