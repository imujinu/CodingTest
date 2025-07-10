package com.jw.java.board.July.Week2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Palin {
    static int N;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken())-1;
            int end = Integer.parseInt(st.nextToken());

            bw.write(isPalin(start,end)? "1\n":"0\n");;
        }
        bw.close();
    }

    static boolean isPalin(int start, int end){
        int[] dp = new int[N];
        int[] reverseDp = new int[N];
        for(int i=start; i<end; i++){
            dp[i] = 1;
            for(int j=start; j<i; j++){
                if(arr[j]<arr[i]){
                    dp[i] = Math.max(dp[j]+1, dp[i]);
                }
            }
        }

        for(int i=end-1; i>=start; i--){
            reverseDp[i] = 1;
            for(int j=end-1; j>i; j--){
                if(arr[j]<arr[i]){
                    reverseDp[i] = Math.max(reverseDp[j]+1, reverseDp[i]) ;
                }
            }
        }

        int max = Integer.MIN_VALUE;
        System.out.println(Arrays.toString(dp));
        System.out.println(Arrays.toString(reverseDp));
        for(int i=0; i<dp.length; i++){

            int temp = dp[i] + reverseDp[i];
            if(temp>max) {
                max=temp;
            }
        }

        int result = ((end-start-1)*2)-1;
        if(result==max-1)return true;
        else{
            return false;
        }

    }
}
