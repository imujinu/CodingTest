package com.jw.java.board.now;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class NumberArrayRefactoring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> list = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i< N ; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        int M  = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<M ; i++){
            int number = Integer.parseInt(st.nextToken());
            boolean isTrue = list.contains(number);
            bw.write((isTrue? String.valueOf(1) : String.valueOf(0) ) + " \n");
        }

        bw.close();
        br.close();


    }
}
