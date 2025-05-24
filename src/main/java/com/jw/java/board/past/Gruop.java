package com.jw.java.board.past;

import java.io.*;
import java.util.StringTokenizer;

public class Gruop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c= 1;
        int d= 1;
        int e= 1;
        for(int i =a; i>0 ; i--) {
            c *= i;
        }for(int i =b; i>0 ; i--) {
            d *= i;
        }for(int i =a-b; i>0 ; i--) {
            e *= i;
        }

        int sum = c / (d*e);
        bw.write(String.valueOf(sum));
        bw.close();
        br.close();
//            a를 1부터 역산하고
            // b도 b부터 1까지 역산하고 a-b도 역산
    }
}
