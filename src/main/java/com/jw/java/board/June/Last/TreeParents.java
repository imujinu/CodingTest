package com.jw.java.board.June.Last;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TreeParents {
    static int N;
    static List<List<Integer>> list;
    static int[] parents;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        list = new ArrayList<>();

        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<N-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.get(start).add(end);
            list.get(end).add(start);
        }
        //양방향 그래프
        // 다시 돌아오지 못하게 visited 처리 해줘야 함.

        visited = new boolean[N+1];
        parents = new int[N+1];
        dfs(1);

        for(int i=2; i<=N; i++){
            bw.write(String.valueOf(parents[i])+"\n");
        }
        bw.close();
    }
    static void dfs(int start){
        visited[start] = true;

        for(int i: list.get(start)){
            if(!visited[i]){

            parents[i] = start;
            dfs(i);
            }
        }
    }
}
