package com.jw.java.board.June.Tweinty;

import java.io.*;
import java.util.StringTokenizer;

public class DoubleArr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] dp = new int[N];
        int[] dp2 = new int[N];
        for(int i=0; i<dp.length; i++){
            dp[i] = arr[0][i];
        }
        int[] dx = {-1,0,1};
        for(int i=1; i<N; i++){
            for(int j=0; j<N; j++){
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(int k=0; k<3; k++){
                    int cx = dx[k]+j;

                    if(cx>0 && cx<N){
                        if(max<arr[i-1][cx])max=arr[i-1][cx];
                        if(min>arr[i-1][cx])min=arr[i-1][cx];
                    }
                }
                max+=arr[i][j];
                min+=arr[i][j];
                dp[j] = max;
                dp[j] = min;
            }
        }

        int maxValue =Integer.MIN_VALUE;
        int minValue =Integer.MIN_VALUE;

        for(int i: dp){
            if(maxValue<i)maxValue=i;
        }
        for(int i: dp2){
            if(minValue>i)minValue=i;
        }
        bw.write(String.valueOf(maxValue)+" "+String.valueOf(minValue));


    }
}
