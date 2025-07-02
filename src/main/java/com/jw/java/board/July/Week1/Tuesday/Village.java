package com.jw.java.board.July.Week1.Tuesday;

import java.io.*;
import java.util.*;

public class Village {
    static int N,M;
    static List<Node> list;
    static int[] parents;
    static class Node implements Comparable<Node> {
        int now;
        int next;
        int dist;

        public Node(int now, int next, int dist) {
            this.now = now;
            this.next = next;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node o) {
            return this.dist-o.dist;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();


        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());
            list.add(new Node(start,end,dist));
        }

        Collections.sort(list);

        parents = new int[N+1];
        for(int i=1; i<=N ;i++)parents[i] = i;

        int total =0;
        int max = 0;

        for(int i=0; i<M; i++){
            int now = list.get(i).now;
            int next = list.get(i).next;
            int dist = list.get(i).dist;
            if(union(now,next)){
                total+=dist;
                max = Math.max(max,dist);
            }
        }

        System.out.println(total-max);

    }
    static int find(int node){
        if(node!=parents[node]){
            parents[node] = find(parents[node]);
        }
        return parents[node];
    }
    static boolean union(int start, int next){
        if(find(start)!=find(next)){
            parents[next] = find(start);
            return true;
        }
        return false;
    }
}
