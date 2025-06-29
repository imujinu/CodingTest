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
        List<int[]> list = new ArrayList<>();
        int[] cost = new int[M];
        int[] visit = new int[M];
        int[] dp = new int[N+1];
        for (int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int temp1 = Integer.parseInt(st.nextToken());
            int temp2 = Integer.parseInt(st.nextToken());
            cost[i] = temp1;
            visit[i] = temp2;
        }

        for(int i=0; i<M; i++){
            for(int j=N; j>=N-cost[i]; j--){
                dp[j]=
            }
        }

        int[] arr = new int[N+1];



    }
}
