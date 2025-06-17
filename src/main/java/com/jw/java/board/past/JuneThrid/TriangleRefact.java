package com.jw.java.board.past.JuneThrid;

import java.io.*;

public class TriangleRefact {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            int[] list = new int[Math.max(M + 1, 6)]; // M이 작을 경우도 대비

            list[1] = 1;
            list[2] = 1;
            list[3] = 1;
            list[4] = 2;
            list[5] = 2;


            for (int j = 6; j <= M; j++) {
                list[j] = list[j - 1] + list[j - 5];
            }

            bw.write(String.valueOf(list[M]) + "\n");
        }

        bw.close();
        br.close();
    }
}
