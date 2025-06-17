package com.jw.java.board.past.JuneTen;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Miro {
    static int M,N;
    static int[][ ] map;
    static boolean[][] visited;
    static int[][] dist;
    static int count;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        dist = new int[N][M];
        for(int i =0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                map[i][j]= str.charAt(j)-'0';
                if(map[i][j]==0){
                    visited[i][j]=true;
                }
            }
        }

        bfs(0,0);

        bw.write(String.valueOf(dist[N-1][M-1]));
        bw.close();

    }

    static void bfs(int y, int x){
        visited[y][x] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y,x});
        dist[y][x] = 1;

        while (!queue.isEmpty()){
            int[] num = queue.poll();
            int a = num[0];
            int b = num[1];

            for(int i=0; i<4; i++){
                int cy = a+dy[i];
                int cx = b+dx[i];

                if(cx>=0 && cy>=0 && cx<M && cy<N){
                    if(map[cy][cx] == 1 && !visited[cy][cx]){
                        if(cy==N && cx ==M)break;
                        visited[cy][cx] = true;
                        dist[cy][cx] = dist[a][b]+1;
                        queue.add(new int[]{cy,cx});
                    }
                }
            }

        }

    }
}
