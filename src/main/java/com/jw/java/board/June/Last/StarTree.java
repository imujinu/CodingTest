package com.jw.java.board.June.Last;

import java.io.*;

public class StarTree {
    static int temp,N;
    static char[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
    }
    static void bfs(int range){
        for(int i=0; i<range; i++){
            System.out.println("  *  ");
            System.out.println(" * * ");
            System.out.println("*****");
        }
    }
}
