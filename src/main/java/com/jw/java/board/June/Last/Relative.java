package com.jw.java.board.June.Last;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Relative {
    static int N, M,temp1 ,temp2;
    static List<List<Integer>> list;
    static int[] dist;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        temp1 = Integer.parseInt(st.nextToken());
        temp2 = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(br.readLine());

        list = new ArrayList<>();
        visited = new boolean[N+1];
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.get(start).add(end);
            list.get(end).add(start);
        }
        dist = new int[N+1];
        Arrays.fill(dist,-1);
        visited[temp1] = true;
        dfs(temp1,0);
        bw.write(String.valueOf(dist[temp2]));
        bw.close();
    }

    static void dfs(int start,int length){
        for(int i: list.get(start)){
            if(!visited[i]){
                visited[i]=true;
            dist[i] = length+1;
            dfs(i,length+1);
            }
        }
    }
}
