package com.jw.java.board.past.JuneTwelve;

import java.io.*;
import java.util.StringTokenizer;

public class Tree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] list = new int[N];
        long right = Integer.MIN_VALUE;
        long left = Integer.MAX_VALUE;
            st = new StringTokenizer(br.readLine());

        for(int i =0; i<N; i++){
            int n = Integer.parseInt(st.nextToken());
            list[i]= n;
            if(n>right) right = n;
            if(n<left) left=n;
        }

        long result =0;

        while(left<=right){
            long mid = (left+right)/2;
            long sum = 0;
            for(int n : list){
                if(n>=mid){
                    sum+=n-mid;
                }
            }

            if(sum>=M){
                left=mid+1;
                result=mid;
            }
            //나무를 너무 많이 자른 경우
            //mid를 높여야 하므로 left를 증가시켜야함
            else{
                right=mid-1;
                //나무를 너무 조금 자른 경우
                // 높이를 낮춰야 하므로 right를 감소시켜야함.
            }
        }

        bw.write(String.valueOf(result));
        bw.close();


    }
}
