package com.jw.java.board.past.JuneTen;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bacon {
    static int N,M, min, idx;
    static boolean[][] graph;
    static boolean[] visited;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N= Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());
        graph = new boolean[N+1][N+1];
        min = Integer.MAX_VALUE;
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a]=true;
        }
        int min = Integer.MAX_VALUE;
        int idx =0;
        for(int i =1; i<=N; i++){
            int sum=0;
        dist = new int[N+1];
            visited = new boolean[N+1];
            bfs(i);

            for(int j=1; j<=N; j++){
                sum+= dist[j];
            }
            if(min>sum) {
                min = sum;
                idx = i;
            }else if(min==sum){
                idx = Math.min(i,idx);

            }
        }
        bw.write(String.valueOf(idx));
        bw.close();

    }
    static void bfs(int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        visited[x] = true;
        dist[x]=0;

        while (!queue.isEmpty()){
            int a = queue.poll();
            for(int i=0; i<=N; i++){
                if(graph[a][i] && !visited[i]){
                    visited[i]=true;
                    dist[i]=dist[a]+1;
                    queue.add(i);
                }
            }

        }
    }
}
