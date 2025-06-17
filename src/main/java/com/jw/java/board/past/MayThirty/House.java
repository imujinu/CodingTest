package com.jw.java.board.past.MayThirty;

import java.io.*;
import java.util.StringTokenizer;

public class House {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] house = new int[N][3];
       int[][] rgb = new int[N][3];
        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++){
                house[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        rgb[0][0] = house[0][0];
        rgb[0][1] = house[0][1];
        rgb[0][2] = house[0][2];

        for(int i=1; i<N; i++){
            rgb[i][0] = Math.min(rgb[i-1][1],rgb[i-1][2])+house[i][0];
            rgb[i][1] = Math.min(rgb[i-1][0], rgb[i-1][2])+house[i][1];
            rgb[i][2] = Math.min(rgb[i-1][0], rgb[i-1][1]) + house[i][2];
        }
        int value = Math.min(Math.min(rgb[N-1][0], rgb[N-1][1]), rgb[N-1][2]);
        bw.write(String.valueOf(value));
        bw.close();
        br.close();

    }
}
