package com.jw.java.board.now;

import java.io.*;
import java.util.StringTokenizer;

public class Virus {
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;

    public static void dfs(int idx){
        answer++;
        visited[idx]=true;
        for(int i =1; i<=N; i++){
            if(!visited[i]&& graph[idx][i]){
                dfs(i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1];
        int x, y;
        for(int i =0; i<M ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = true;
        }

        dfs(1);
        bw.write(String.valueOf(answer-1));
        bw.close();
        br.close();


    }
}
