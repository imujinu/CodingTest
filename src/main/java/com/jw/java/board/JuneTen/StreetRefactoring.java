package com.jw.java.board.JuneTen;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class StreetRefactoring {
    static int N,M,x,y;
    static int[][] map;
    static boolean[][]visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

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

    }

    public static void bfs(int y, int x){
        map[y][x]= 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});



    }
}
