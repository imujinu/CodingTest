package com.jw.java.board.June.Last;

import java.io.*;
import java.util.*;

public class RelativeBfs {
    static int N, M,temp1 ,temp2;
    static int length = -1;
    static List<List<Integer>> list;
    static boolean[] visited;
    static void bfs(int start){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start,0});

        while(!queue.isEmpty()){
            int[] arr = queue.poll();
            int now = arr[0];
            int dist = arr[1];
            if(now == temp2){
                length = dist;
                return;
            }
            for(int i : list.get(now)){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(new int[]{i,dist+1});
                }
            }


        }
    }
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
        visited[temp1] = true;
        bfs(temp1);
        bw.write(String.valueOf(length));
        bw.close();
    }
}
