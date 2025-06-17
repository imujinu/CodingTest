package com.jw.java.board.past.now;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i< N ; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        int M  = Integer.parseInt(br.readLine());

           st = new StringTokenizer(br.readLine());
        for(int i =0; i<M ; i++){
            int number = Integer.parseInt(st.nextToken());
            Boolean result = Arrays.stream(list).anyMatch(el -> el == number);
            bw.write((result ? String.valueOf(1) : String.valueOf(0)) + "\n");
        }

        bw.close();
        br.close();


    }
}
