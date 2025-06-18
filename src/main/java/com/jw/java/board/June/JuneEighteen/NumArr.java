package com.jw.java.board.June.JuneEighteen;

import java.io.*;
import java.util.*;

public class NumArr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        int[] dp = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            numbers[i]=num;
        }
        int maxLen = 0;
        for(int i=0; i<N; i++){
            dp[i]=1;
            for(int j=0; j<i; j++){
                if(numbers[j]<numbers[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            maxLen = Math.max(maxLen,dp[i]);
        }
        bw.write(String.valueOf(maxLen));
        bw.close();

    }
}
