package com.jw.java.board.past;

import java.io.*;
import java.util.StringTokenizer;

public class MaxMin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int ogNum1 = num1;
        int ogNum2 = num2;
        while(num2!=0){
            int num3 = num2;
            num2 = num1%num2;
            num1 = num3;
        }
        int max = num1;
        int min = ogNum1*ogNum2/max;

        bw.write(String.valueOf(max)+ "\n");
        bw.write(String.valueOf(min)+ "\n");

        bw.close();
        br.close();


    }
}
