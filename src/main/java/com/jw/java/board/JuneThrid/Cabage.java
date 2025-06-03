package com.jw.java.board.JuneThrid;

import java.io.*;
import java.util.StringTokenizer;

public class Cabage {
    static int[][] field;
    static boolean[][] visited;
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };
    static int N,M, K ;
    static int count;
    static void dfs(int x, int y){
        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int cx = x+dx[i];
            int cy = y+dy[i];

            if(cx>=0 && cy>=0 && cx<N && cy<M){
                if (!visited[cx][cy] && field[cx][cy] == 1) {
                    dfs(cx, cy);
                }
            }

        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
             field = new int[N][M];
            visited = new boolean[N][M];

            for(int j =0; j<K; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[x][y] = 1;
            }

            for(int x=0; x<N; x++){
                for(int y=0; y<M ; y++){
                  if(field[x][x]==1 && !visited[x][y] ){
                      dfs(x,y);
                      count++;
                  }
                }
            }

        }
        bw.write(String.valueOf(count));
        bw.close();
        br.close();


    }
}
