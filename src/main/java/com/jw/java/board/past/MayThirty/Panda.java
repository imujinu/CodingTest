package com.jw.java.board.past.MayThirty;

import java.io.*;
import java.util.StringTokenizer;

public class Panda {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] numbers = new int[N][N];

        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                numbers[i][j] =Integer.parseInt(st.nextToken());
            }
        }


    }
}
