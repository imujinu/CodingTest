package com.jw.java.board.JuneTen;

import java.io.*;
import java.util.*;

public class Street{
    static int N, M;
    public static int[][] map;
    public static boolean[][] visited;
    public static int[][] dist;
    public static int[] dx = {1,-1,0,0};
    public static int[] dy = {0,0,1,-1};

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
            String str = br.readLine();
            for(int j=0; j<M; j++){
                map[i][j] = str.charAt(j)-'0';
                // char를 숫자로 입력하기 위해 - '0'을 해준다.

                if(map[i][j]==0){
                    visited[i][j]=true;
                }
            }
        }
        bfs(0,0);

        bw.write(String.valueOf(dist[N-1][M-1]));
        bw.close();
        br.close();
    }

    public static void bfs(int y, int x){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y,x});
        dist[y][x]=1;
        visited[y][x] = true;

            while (!queue.isEmpty()){
                int[] number = queue.poll();
                int a = number[0];
                int b = number[1];
                for(int i=0; i<4; i++){
                    int cy = a+ dy[i];
                    int cx = b+ dx[i];

                if(cx>=0 && cy>=0 && cy<N && cx <M){
                    if(map[cy][cx]==1 && !visited[cy][cx]){
                        visited[cy][cx] = true;
                        dist[cy][cx]= dist[a][b]+1;
                        queue.add(new int[]{cy,cx});
                    }
                }

            }

        }
    }

}