package com.jw.java.board.past.now;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Array2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[][] list = new String[N][2];
        for (int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[i][0] = st.nextToken();
            list[i][1] = st.nextToken();
        }

        Arrays.sort(list, Comparator.comparingInt((String[] o)-> Integer.parseInt(o[0])).thenComparingInt(o->Integer.parseInt(o[1])));

        for (int i =0; i<N; i++)bw.write(list[i][0]+" " +list[i][1]+"\n");
        bw.close();
        br.close();

    }
}
