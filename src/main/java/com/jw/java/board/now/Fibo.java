package com.jw.java.board.now;

import java.io.*;

public class Fibo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        if(N==0) {
            System.out.println(0);
            return;
        }
        if(N==1) {
            System.out.println(1);
            return;
        }
        long a= 0;
        long b =1;
        long sum = 0;
        for(int i =2; i<= N; i++){
            sum = a+b;
            a= b;
            b=sum;
        }
        System.out.println(sum);
    }
}
