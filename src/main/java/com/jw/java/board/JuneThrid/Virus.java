package com.jw.java.board.JuneThrid;

import java.io.*;

public class Virus {
    static boolean[][] virus;
    static boolean[] visited;

    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N= Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        virus = new boolean[N][N];
        visited = new boolean[N];
        for(int i=0; i<M; i++){
            for(int j =0; j<N; j++){
                for(int k=0; k<N; k++){
                    if(virus[j][k]==1 && visited[] )
                }
            }
        }


    }
}
