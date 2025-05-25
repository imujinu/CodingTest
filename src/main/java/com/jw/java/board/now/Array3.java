package com.jw.java.board.now;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Array3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] list = new int[N][2];
        int x,y;
        for(int i =0; i<N; i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            list[i][0] = x;
            list[i][1]=y;
        }

        Arrays.sort(list, Comparator.comparingInt((int[] o1)-> o1[1]).thenComparingInt((int[] o1)->o1[0]));

        for(int i=0; i<N; i++){
            bw.write(list[i][0] + " " +list[i][1] +"\n");
        }
        bw.close();
        br.close();
    }
}
