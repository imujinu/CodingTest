package com.jw.java.board.June.Last;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bitonic {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp1 = new int[N];
        int[] dp2 = new int[N];
        for(int i=0; i<N; i++){
            dp1[i] = 1;
            dp2[i] = 1;
            for(int j=0; j<i; j++){
                if(arr[j]<arr[i]){
                    dp1[i] = Math.max(dp1[j]+1, dp1[i]);
                }
                if(arr[j]>arr[i]){
                    dp2[i] = Math.max(dp2[j]+1, dp2[i]);
                }
            }
        }
        int max =0;
        for(int i=0; i<dp1.length; i++){
            max= Math.max(max, dp1[i]+dp2[i]-1);
        }
        System.out.println(Arrays.toString(dp1));
        System.out.println(Arrays.toString(dp2));

        bw.write(String.valueOf(max));
        bw.close();


    }
}
