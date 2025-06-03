package com.jw.java.board.JuneThrid;

import java.io.*;
import java.util.StringTokenizer;

public class Cabage {
    static int[][] field;
    static boolean[][] visited;
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };
    static int N,M, K ;

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
        int R = Integer.parseInt(br.readLine());

        for(int i =0; i<R; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            int count=0;
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
                  if(field[x][y]==1 && !visited[x][y] ){
                      //해당 구역에 배추가 심어져있고, 방문한적이 없다면 dfs수행
                      // dfs는 해당 구역을 1로 바꾸고, 상하좌우로 인접한 구역의 값을 1로 바꿔준다.

                      dfs(x,y);
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
