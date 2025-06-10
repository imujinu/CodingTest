package com.jw.java.board.JuneTen;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Danji {
    static int N,M;
    static boolean[][] graph;
    static boolean[][] visited;
    static int countPerDanji;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N= Integer.parseInt(br.readLine());

        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1][N+1];

        for(int i=1; i<=N; i++){
            String str = br.readLine();
            for(int j=1; j<=N; j++){
                graph[i][j] = str.charAt(j-1) == '1';
            }
        }
        //2차원 배열에 단지 정보를 입력해준다.
        ArrayList<Integer> apart = new ArrayList<>();
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(graph[i][j] && !visited[i][j]){
                    countPerDanji = 0;
                    dfs(i,j);
                    apart.add(countPerDanji);
                }
            }
        }

        Collections.sort(apart);

        bw.write(String.valueOf(apart.size())+"\n");
        for(int i=0; i<apart.size(); i++){
            bw.write(String.valueOf(apart.get(i))+"\n");
        }
        bw.close();
        br.close();

    }



    private static void dfs(int j, int x) {
        visited[j][x] = true;
        countPerDanji++;
        for(int a=0; a<4; a++){
            int cy = j+dy[a];
            int cx = x+dx[a];
            if (cy >= 1 && cy <= N && cx >= 1 && cx <= N) {
                if (graph[cy][cx] && !visited[cy][cx]) {
                    dfs(cy, cx);
                }
            }
        }

    }
}
