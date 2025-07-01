package com.jw.java.board.June.Last;

import java.io.*;
import java.util.*;

public class Tree {
    static int N,maxLen,maxNode;
    static List<List<int[]>> list;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        visited = new boolean[N+1];
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<N-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());
            list.get(start).add(new int[]{end,dist});
            list.get(end).add(new int[]{start,dist});
        }
        int sum=0;
        dfs(1,0);
        sum+=maxLen;
        maxLen=0;
        visited= new boolean[N+1];
        dfs(maxNode, 0);
        sum+=maxLen;
        bw.write(String.valueOf(maxLen));
        bw.close();


    }

    static void dfs(int start, int dist){
        visited[start] = true;

        if(dist>maxLen){
            maxLen=dist;
            maxNode=start;
        }

        for(int[] temp : list.get(start)){
            int next = temp[0];
            int nextLen = temp[1];
            if(!visited[next]){
                dfs(next,dist+nextLen);
            }
        }

    }
}
