package com.jw.java.board.past.JuneTen;

import java.io.*;
import java.util.StringTokenizer;

public class Chess {
    static String[] board;
    static int val1,val2,min;

    static void check(int y, int x){
        String[] bw = {"BWBWBWBW","WBWBWBWB"};
        val1 = 0;
        val2 =0;
        for(int i =0; i<8; i++){
            int row = i+y;
            for(int j=0; j<8; j++){
                int col = x+j;
                if(board[row].charAt(col)!=bw[i%2].charAt(j))val1++;
                else{
                    val2++;
                }

            }
        }
        min = Math.min(min, Math.min(val2,val1));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new String[N];

        for(int i=0; i<N; i++){
            board[i] = br.readLine();
        }
        min = 64;
        for(int i =0; i<=N-8; i++){
            for(int j=0; j<=M-8; j++){
               check(i,j);

            }
        }
        bw.write(String.valueOf(min));
        bw.close();
        br.close();




    }
}
