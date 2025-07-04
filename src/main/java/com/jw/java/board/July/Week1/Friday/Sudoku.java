package com.jw.java.board.July.Week1.Friday;

import java.io.*;

public class Sudoku {
    static int[][] map;
    static boolean[][] visited;
    static int N = 9;

    static void dfs(){




    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        map = new int[N][N];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j] = str.charAt(j)-'0';
            }
        }


        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
               bw.write(map[i][j]);
            }
            bw.write("\n ");
        }
        bw.close();
    }
}
