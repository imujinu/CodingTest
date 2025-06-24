package com.jw.java.board.June.TwentThree;

import java.io.*;
import java.util.StringTokenizer;

public class SumArr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] dp = new int[N][N];
        dp[0][0] = map[0][0];
        // 경우의 수 세가지
        // 자신의 위에만 값이 존재하는 경우
        // 자신의 왼쪽과 위에 값이 존재하는 경우
        // 자신의 왼쪽에만 값이 존재하는 경우
        for(int i=1; i<N; i++){
            dp[0][i] = dp[0][i-1]+map[0][i];
            dp[i][0] = dp[i-1][0]+map[i][0];
        }

        for(int i=1; i<N; i++){
            for(int j=1; j<N; j++){
             dp[i][j] = dp[i][j-1]+dp[i-1][j]-dp[i-1][j-1]+map[i][j];
            }
        }



        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int startY= Integer.parseInt(st.nextToken())-1;
            int startX= Integer.parseInt(st.nextToken())-1;
            int endY= Integer.parseInt(st.nextToken())-1;
            int endX= Integer.parseInt(st.nextToken())-1;
            int sum = dp[endY][endX];
            if (startY > 0) sum -= dp[startY - 1][endX];
            if (startX > 0) sum -= dp[endY][startX - 1];
            if (startY > 0 && startX > 0) sum += dp[startY - 1][startX - 1];
            bw.write(String.valueOf(sum)+"\n");
        }
        bw.close();

    }
}
