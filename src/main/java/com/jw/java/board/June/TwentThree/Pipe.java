package com.jw.java.board.June.TwentThree;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Pipe {
    static int[][] map;
    static int[][][] dp;
    static int N, count;
    static int[] dx = {-1,0,-1};
    static int[] dy = {0,-1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        dp = new int[N][N][3];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][1][0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < 3; k++) {
                    if (dp[i][j][k] == 0) continue;

                    if (k == 0 || k == 2) {
                        // 가로 이동
                        if (j + 1 < N && map[i][j + 1] == 0) {
                            dp[i][j + 1][0] += dp[i][j][k];
                        }
                    }

                    if (k == 1 || k == 2) {
                        // 세로 이동
                        if (i + 1 < N && map[i + 1][j] == 0) {
                            dp[i + 1][j][1] += dp[i][j][k];
                        }
                    }

                    // 대각선 이동
                    if (i + 1 < N && j + 1 < N &&
                            map[i][j + 1] == 0 &&
                            map[i + 1][j] == 0 &&
                            map[i + 1][j + 1] == 0) {
                        dp[i + 1][j + 1][2] += dp[i][j][k];
                    }
                }
            }
        }


        int sum = dp[N-1][N-1][0] + dp[N-1][N-1][1] + dp[N-1][N-1][2];
        bw.write(String.valueOf(sum));
        bw.close();

    }
}
