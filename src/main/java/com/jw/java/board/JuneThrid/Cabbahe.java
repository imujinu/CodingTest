package com.jw.java.board.JuneThrid;

import java.io.*;
import java.util.StringTokenizer;

public class Cabbahe {
    static int N,M,K, x,y, count;
    static boolean[][] cabbage;
    static boolean[][] visited;

    static int[] dx= {-1,1,0,0};
    static int[] dy= {0,0,-1,1};

    static void dfs(int a, int b){
        cabbage[a][b] = false;

        for(int i=0; i<4; i++){
            int cx = a+dx[i];
            int cy = b+dy[i];
            if(cx >= 0 && cy >= 0 && cx < N && cy < M && cabbage[cx][cy]){
                dfs(cx, cy);
            }


        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int range = Integer.parseInt(br.readLine());

        for(int i =0; i<range; i++){
            count=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            N= Integer.parseInt(st.nextToken());
            M= Integer.parseInt(st.nextToken());
            K= Integer.parseInt(st.nextToken());
            cabbage = new boolean[N][M];
            for(int j=0; j<K; j++){
                st = new StringTokenizer(br.readLine());
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());
                cabbage[x][y] =true;
            }

            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                    if(cabbage[j][k]){
                        dfs(j,k);
                        count++;
                    }
                }
            }
            bw.write(String.valueOf(count)+"\n");

        }
            bw.close();
            br.close();
    }
}
