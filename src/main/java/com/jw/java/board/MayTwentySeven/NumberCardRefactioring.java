package com.jw.java.board.MayTwentySeven;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class NumberCardRefactioring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> numbers = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            numbers.put(num, numbers.getOrDefault( num, 0)+1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            int count = numbers.getOrDefault(Integer.parseInt(st.nextToken()),0);
            bw.write(String.valueOf(count)+ " ");
        }
        bw.close();
        br.close();

    }
}
