package com.jw.java.board.June.TwentThree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bag {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] dp = new int[M+1];
        int[] weight = new int[N];
        int[] price = new int[N];
        for(int i=0 ; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int temp1 = Integer.parseInt(st.nextToken());
            int temp2 = Integer.parseInt(st.nextToken());
            weight[i] = temp1;
            price[i] = temp2;
        }

        for(int i=0; i<N; i++){
            for(int j=M; j>=weight[i]; j--){
                dp[j] = Math.max(dp[j], dp[j- weight[i]]+price[i]);
            }
        }

       int sum = 0;
        for(int i : dp){
            sum = Math.max(sum,i);
        }
        bw.write(String.valueOf(dp[M]));
        bw.close();

    }
}
