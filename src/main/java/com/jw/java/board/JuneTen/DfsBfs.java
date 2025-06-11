package com.jw.java.board.JuneTen;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DfsBfs {
    static int N,M,K;
    static boolean[][] graph;
    static boolean[] dfsVisited;
    static boolean[] bfsVisited;
    static ArrayList<Integer> val1;
    static ArrayList<Integer> val2;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        graph = new boolean[N+1][N+1];
        dfsVisited = new boolean[N+1];
        bfsVisited = new boolean[N+1];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] =true;
        }
        val1 = new ArrayList<>();
        val2 = new ArrayList<>();

        dfs(K);
        bfs(K);

        for(int i =0; i<val1.size(); i++){
            bw.write(String.valueOf(val1.get(i))+" ");
        }
        bw.write("\n");
        for(int i =0; i<val2.size(); i++){
            bw.write(String.valueOf(val2.get(i))+" ");
        }

        bw.close();

    }

    static void dfs(int x){
        val1.add(x);
        dfsVisited[x] = true;
        for(int i=1; i<=N; i++){
            if(graph[x][i] && !dfsVisited[i]){
                dfs(i);
            }
        }
    }

    static void bfs(int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        val2.add(x);
        bfsVisited[x] = true;

        while (!queue.isEmpty()){
            int a = queue.poll();
            for(int i=1; i<=N; i++){
                if(graph[a][i] && !bfsVisited[i]){
                    bfsVisited[i] = true;
                    queue.add(i);
                    val2.add(i);
                }
            }

        }

    }
}
