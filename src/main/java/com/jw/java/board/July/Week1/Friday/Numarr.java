package com.jw.java.board.July.Week1.Friday;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Numarr {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());
        long[] arr = new long[N+1];
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        int left =0;
        int right=0;
        long sum =0;
        long size = Long.MAX_VALUE;

        while(left<arr.length && right<arr.length){
            if(sum>=M){
                size=Math.min(size,right-left);
            }
            if(sum>=M){
                sum-=arr[left++];
            }else{
                sum+=arr[right++];
            }

        }

        if(size==Long.MAX_VALUE){
            bw.write(0);
        }else{
            bw.write(String.valueOf(size));
        }
        bw.close();
    }
}
