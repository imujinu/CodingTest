package com.jw.java.board.past;

import java.io.*;
import java.util.StringTokenizer;

public class Snail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int day = (int) Math.ceil((double) (c-a)/(a-b))+1;


        bw.write(String.valueOf(day));


        bw.close();
        br.close();
    }
}
