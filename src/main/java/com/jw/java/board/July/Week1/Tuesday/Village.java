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

        for(Node node : list){
            if(union(node.now, node.next)){
                total += node.dist;
                max = Math.max(max,node.dist);
            }
        }
    }

    static int find(int idx){
        if(idx != parents[idx])parents[idx] = find(parents[idx]);
        return parents[idx];
    }

    static boolean union(int now, int next){
        int rootA = find(now);
        int rootB = find(next);
        if(rootA==rootB)return false;
        parents[next] = rootA;
        return true;
    }
}
