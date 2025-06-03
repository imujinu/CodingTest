package com.jw.java.board.JuneThrid;

import java.io.*;
import java.util.StringTokenizer;

public class Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] numbers = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M ; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }


        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int startIdx = Integer.parseInt(st.nextToken());
            int lastIdx = Integer.parseInt(st.nextToken());

        int sum = 0;

        for(int j =startIdx-1; j<lastIdx; j++){
            sum += numbers[j];
        }
        bw.write(String.valueOf(sum)+"\n");


        }
        bw.close();
        br.close();

    }
}
