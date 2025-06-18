package com.jw.java.board.June.JuneEighteen;

import java.io.*;
import java.util.StringTokenizer;

public class Stair {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        int[] length = new int[N];

        for(int i=0; i<N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            list[i] = num;
        }

        length[0] = list[0];
        if (N >= 2) {
            length[1] = list[0] + list[1];
        }
        if (N >= 3) {
            length[2] = Math.max(length[1], Math.max(list[0] + list[2], list[1] + list[2]));
        }
        for (int i = 3; i < N; i++) {
            length[i] = Math.max(length[i - 2] + list[i], length[i - 3] + list[i - 1] + list[i]);
        }


        bw.write(String.valueOf(length[N-1]));
        bw.close();




    }
}
