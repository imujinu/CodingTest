package com.jw.java.board.June.NineTeen;

import java.io.*;
import java.util.StringTokenizer;

public class TriangleTree {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        int[][] triangle = new int[N][N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                int num = Integer.parseInt(st.nextToken());
                triangle[i][j] =num;
            }
        }


        int[][] dp = new int[N][N];
        dp[0][0] = triangle[0][0];

        for(int i=1; i<N; i++){
            int max =0;
           for(int j=0; j<N; j++){



               dp[i][j] = triangle[i][j];
           }
        }



    }
}
