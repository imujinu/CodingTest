package com.jw.java.board.JuneTen;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class StreetRefactoring {
    static int N,M,x,y;
    static int[][] map;
    static boolean[][]visited;
    static int[][] dist;
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
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==2){
                    y=i;
                    x=j;
                }
                else if(map[i][j]==0){
                    visited[i][j]=true;
                }

            }
        }
        bfs(y,x);

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(!visited[i][j]){
                    dist[i][j]=-1;
                }
                bw.write(String.valueOf(dist[i][j])+" ");
            }
            bw.write("\n");
        }

        bw.close();
        br.close();

    }

    public static void bfs(int y, int x){
        Queue<int[]> queue = new LinkedList<>();
        visited[y][x]=true;
        queue.add(new int[]{y,x});

        while (!queue.isEmpty()){
            int[] number = queue.poll();

            int a = number[0];
            int b = number[1];

            for(int i=0; i<4; i++){
                int cy = a+ dy[i];
                int cx = b+ dx[i];

                if(cy>=0 && cx >=0 && cy<N && cx<M){
                    if(map[cy][cx]==1 && !visited[cy][cx]){
                        visited[cy][cx]= true;
                        dist[cy][cx] = dist[a][b] +1;
                        queue.add(new int[]{cy,cx});
                    }
                }
            }

        }



    }
}
