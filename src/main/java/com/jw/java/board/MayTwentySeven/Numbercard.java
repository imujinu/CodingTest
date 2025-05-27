package com.jw.java.board.MayTwentySeven;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Numbercard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] numbers = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++){
            numbers[i]=Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<M; i++){
            int a = Integer.parseInt(st.nextToken());
            long count = Arrays.stream(numbers).filter(el -> el == a).count();
            bw.write(String.valueOf(count)+ " ");
        }

        bw.close();
        br.close();


    }
}
