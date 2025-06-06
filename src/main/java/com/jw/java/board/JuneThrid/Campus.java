package com.jw.java.board.JuneThrid;

import java.io.*;
import java.util.StringTokenizer;

public class Campus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] map = new char[N][M];
        for(int i=0; i<N; i++){
            map[i] = br.readLine().toCharArray();
        }




    }
}
