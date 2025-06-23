package com.jw.java.board.June.TwentThree;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sumba3 {
    static int N,M, result;
    static int Max = 100001;
    static int[] dx = {-1,1};
    static boolean[] visited;
    static void bfs(int start){
        Deque<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start,0});

        while (!queue.isEmpty()){
            int[] arr = queue.poll();
            int temp = arr[0];
            int time = arr[1];
            if(temp ==M){
                result=time;
                return;
            }
            for(int i=0; i<2; i++){
                int cx = dx[i] + temp;
                if(cx>=0 && cx<Max && !visited[cx]){
                 visited[cx]=true;
                queue.addLast(new int[]{cx,time+1});
                }
            }
            int cx = temp*2;
            if(cx<Max &&!visited[cx] ){
                visited[cx] = true;
                queue.addFirst(new int[]{cx, time});
            }


        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[Max];
        bfs(N);
        bw.write(String.valueOf(result));
        bw.close();

    }
}
