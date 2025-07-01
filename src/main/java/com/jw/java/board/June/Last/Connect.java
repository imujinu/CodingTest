package com.jw.java.board.June.Last;

import java.io.*;
import java.util.StringTokenizer;

public class Connect {
    static boolean[] visited;
    static boolean[][] map;
    static int N,M,count;
    static void dfs(int now){
        visited[now] = true;

        for(int i=1; i<N+1; i++){
            if(map[now][i]&& !visited[i]){
               map[now][i] = map[i][now] = false;
               dfs(i);
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new boolean[N+1][N+1];
        visited = new boolean[N+1];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            map[start][end]=map[end][start]=true;
        }

        for(int i=1; i<N+1; i++){
            if(!visited[i]){
                dfs(i);
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
    }
}
