package com.jw.java.board.past.JuneThrid;

import java.io.*;
import java.util.StringTokenizer;

public class Graph {
    static int N,M, count;
    static boolean[][] graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());
        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1];
        for(int i =0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x]=true;
        }

        for(int i=0; i<N+1; i++){
            if(!visited[i]){
                dps(i);
            count++;
            }
        }

        bw.write(String.valueOf(count-1));
        bw.close();
        br.close();

    }

    private static void dps(int i) {
        visited[i] = true;

        for(int x =0; x<N+1; x++){
            if(graph[i][x]&& !visited[x]){
                graph[i][x]=graph[x][i]=false;
                dps(x);
            }
        }
    }

}
