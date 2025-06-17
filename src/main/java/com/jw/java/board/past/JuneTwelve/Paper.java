package com.jw.java.board.past.JuneTwelve;

import java.io.*;
import java.util.StringTokenizer;

public class Paper {
    static int[][] paper;
    static int N, blue,white;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        paper= new int[N][N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                int number =Integer.parseInt(st.nextToken());
                paper[i][j]=number;
            }
        }

        search(0,0,N);

        bw.write(white+"\n"+blue);
        bw.close();


    }
    static void search(int y, int x, int z){
        int color = paper[y][x];
        if(check(y,x,z)){
            if(color==1)blue++;
            else{
                white++;
            }
        }else{

        int half = z/2;
        search(y,x,half);
        search(y+half,x,half);
        search(y,x+half,half);
        search(y+half,x+half,half);

        }
    }
    static boolean check(int y, int x, int z){
        int color = paper[y][x];
        for(int i=y; i<y+z; i++){
            for(int j=x; j<x+z; j++ ){
                if(paper[i][j]!=color){
                    return false;
                }
            }
        }
        return true;
    }

}
