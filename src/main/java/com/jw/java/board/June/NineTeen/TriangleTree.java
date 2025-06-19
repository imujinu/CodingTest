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
            for(int j=0; j<=i; j++){
                int num = Integer.parseInt(st.nextToken());
                triangle[i][j] =num;
            }
        }

        // 8 1 5 이전 idx, 혹은 +1까지 선택 가능
        //3 8 [1,0] [1,1] j는 i까지 증가 가능
        //7

        int[][] dp = new int[N][N];
        dp[0][0] = triangle[0][0];

        for(int i=1; i<N; i++){
           for(int j=0; j<=i; j++){
            if(j==0)dp[i][j] = dp[i-1][j]+triangle[i][j];
            else{

               dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j])+triangle[i][j];
               // dp[1][0] == dp[0][0] + triangle[1][0]
            }

           }
        }

        int max =0;

        for(int i=0; i<N; i++){
            int num =dp[N-1][i];
            if(max <num) max=num;
        }

        bw.write(String.valueOf(max));
        bw.close();


    }
}
