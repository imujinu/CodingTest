package com.jw.java.board;

import java.io.*;
import java.util.StringTokenizer;

public class Array2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int range = Integer.parseInt(br.readLine());
        int[] list = new int[range];
        for (int i=0; i<list.length ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[i] = Integer.parseInt(st.nextToken());
        }

    }
}
