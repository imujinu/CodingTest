package com.jw.java.board.June.NineTeen;

import java.io.*;
import java.util.StringTokenizer;

public class Sticker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        for(int i=0; i<length; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            int[][] numbers = new int[N][2];

                st = new StringTokenizer(br.readLine());
            for(int j=0;j<N; j++){
                int num = Integer.parseInt(st.nextToken());
                numbers[j][0] = num;
            }
                st = new StringTokenizer(br.readLine());
            for(int j=0;j<N; j++){
                int num = Integer.parseInt(st.nextToken());
                numbers[j][1] = num;
            }

            // numbers = {{50,30}, {10,50}, {100,70} .... }

            int[][] dp = new int[N][2];
            if(N==1){
            dp[0][0] = numbers[0][0];
            dp[0][1] = numbers[0][1];
            bw.write(String.valueOf(Math.max( dp[0][0], dp[0][1]))+"\n");
            }
            if(N==2){
            dp[1][0] = numbers[0][1]+numbers[1][0];
            dp[1][1] = numbers[0][0]+numbers[1][1];

            bw.write(String.valueOf(Math.max( dp[1][0],dp[1][1]))+"\n");
            }
            if(N>2){
                dp[0][0] = numbers[0][0];
                dp[0][1] = numbers[0][1];
                dp[1][0] = numbers[0][1]+numbers[1][0];
                dp[1][1] = numbers[0][0]+numbers[1][1];

            for(int j=2; j<N; j++){
                dp[j][0] = Math.max(dp[j-1][1] + numbers[j][0], Math.max(dp[j-2][0],dp[j-2][1])+numbers[j][0]);
                dp[j][1] = Math.max(dp[j-1][0] + numbers[j][1], Math.max(dp[j-2][0],dp[j-2][1])+numbers[j][1]);
            }
            int max = Math.max(dp[N-1][0], dp[N-1][1]);

            bw.write(String.valueOf(max)+"\n");
            }
        }
            bw.close();
    }
}
