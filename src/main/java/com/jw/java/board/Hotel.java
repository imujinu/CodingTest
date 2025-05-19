package com.jw.java.board;

import java.io.*;
import java.util.StringTokenizer;

public class Hotel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int range = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i= 0; i<range ; i++){
            int h = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int guestNumber = Integer.parseInt(st.nextToken());



        }
    }
}
