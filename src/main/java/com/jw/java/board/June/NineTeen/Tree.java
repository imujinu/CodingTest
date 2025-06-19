package com.jw.java.board.June.NineTeen;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Tree {
    static ArrayList<Integer>[] tree;
    static int[] parent;
    static boolean[] visited;
    static int N;

    static void dfs(int start){
        visited[start] = true;

        for(int node : tree[start]){
            if(!visited[node]){
                parent[node] = start;
                dfs(node);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        tree = new ArrayList[N+1];
        parent = new int[N+1];
        visited = new boolean[N+1];

        for(int i=0; i<N+1; i++){
            tree[i] = new ArrayList<>();
        }

        for(int i=0; i<N-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            tree[node1].add(node2);
            tree[node2].add(node1);
        }

        dfs(1);

       for(int i=2; i<N+1; i++){
           bw.write(String.valueOf(parent[i])+"\n");
       }

        bw.close();








    }
}
