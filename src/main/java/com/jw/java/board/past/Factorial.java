package com.jw.java.board.past;

import java.io.*;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int sum = 1;
        int count =0;

        for(int i=5; i<=a; i*=5){
            count += a/i;
        }
        bw.write(String.valueOf(count));
        bw.close();
        br.close();


    }
}
