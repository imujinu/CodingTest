package com.jw.java.board;

import java.io.*;

public class Deveil {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

        int number = 666;
        int count = 0;
        while (true){
            if(String.valueOf(number).contains("666")){
                count++;
            }
            if(a==count) break;
            number++;

        }
        bw.write(String.valueOf(number));
        bw.close();
        br.close();
    }
}
