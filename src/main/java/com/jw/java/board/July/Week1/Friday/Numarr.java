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

        int[] arr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int left =0;
        int right =0;
        int size = Integer.MAX_VALUE;
        int sum =0 ;
        while(left<=N && right<=N){
            if(sum>=M){
                size=Math.min(size,right-left);
                sum-=arr[left++];
            }else{
                sum+=arr[right++];
            }
        }
        System.out.println(size==Integer.MAX_VALUE? 0 : size)   ;
        System.out.println();
    }
}
