package com.jw.java.board.June.Last;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class NumArr {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[N];
        int maxLen = 0;
        //dp는 특정 시점에서의 값이 최적의 값임을 전제하고 있어야해
        //dp[i]에서의 최적의 값은 만약에 이전 값보다 크다면 +1
        // 이전 값보다 값이 작을 때가 중요하구나
        for(int i=0; i<N; i++){
            dp[i] = 1;
            //자기 자신만을 넣는 경우 20 30 10
            for(int j=0; j<i; j++){
            //만약 이전에 자기보다 작은 값이 등장했다면 거기서 +1
            // 근데 만약 그 값이 한개였다면 dp[i] =1;
            if(arr[j]<arr[i]){
                dp[i] = Math.max(dp[j]+1, dp[i]);
            }
            }
            maxLen = Math.max(dp[i],maxLen);
        }


        bw.write(String.valueOf(maxLen));
        bw.close();
    }
}
