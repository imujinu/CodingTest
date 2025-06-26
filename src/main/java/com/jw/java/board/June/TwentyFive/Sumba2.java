package com.jw.java.board.June.TwentyFive;

import java.io.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sumba2 {
    static int N,M,count;
    static int[] dist = new int[100001];
    static int minDepth = Integer.MAX_VALUE;
    static int[] dx = {-1,1};
    static void bfs(int start, int depth){

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start,depth});
        dist = new int[100001];
        while(!queue.isEmpty()){
            int[] arr = queue.poll();
            int now = arr[0];
            int dep = arr[1];
            if(dep>minDepth)break;
            if(now == M){
                minDepth=dep;
                count++;
            }

            int next = now*2;
            if(next>=0 && next<=100000 && (dist[next]==0 || dep+1<=dist[next]) ){
                dist[next] = dep+1;
            queue.add(new int[]{next,dep+1});
            }

            for(int i=0; i<2; i++){
                int cx = dx[i]+now;
                if(cx>=0 && cx<=100000 && (dist[cx]==0 || dep+1<=dist[cx]) ) {
                dist[cx] = dep+1;
                queue.add(new int[]{cx,dep+1});
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        bfs(N,0);

        bw.write(String.valueOf(minDepth)+"\n"+String.valueOf(count));
        bw.close();
    }
}
