package com.jw.java.board.MayTwentySeven;

import java.io.*;
import java.net.Inet4Address;
import java.util.StringTokenizer;

public class Prime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int minus = M-N+1;
        int[] numbers = new int[minus];

        for(int i =0 ; i<minus ; i++){
           numbers[i]=i;
        }

        for(int i =0 ; i<minus ; i++){
            if(numbers[i]==0)continue;

            for(int j=2*i; j<minus; j+=i){
                numbers[j]= 0;
            }
        }

        for(int i =0; i<minus; i++){
            if(numbers[i]!=0)
            {
            System.out.println(String.valueOf(numbers[i]));
        }}
    }
}
