package com.jw.java.board.past.JuneTwelve;

import java.io.*;
import java.util.StringTokenizer;

public class Line {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] list = new int[N];
        long left = 1;
        long right = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            list[i] = num;
        }
        // 입력 로직
        for(int n : list){
            if(n>right)right=n;
        }
        // max값 찾기 로직
        long result = 0;

        while(left<=right){
            long mid = (left+right)/2;
            long count = 0;
            for(int n : list){
                count+= n/mid;
            }

            if(count<M){
                right = mid-1;
            }else{
                result=mid;
               left= mid+1;
            }


        }
        bw.write(String.valueOf(result));
        bw.close();



    }
}
