package com.jw.java.board.June.TwentyFive;

import java.io.*;
import java.util.*;

public class Floid {
    static List<List<Node>> list;
    static PriorityQueue<Node> pq;
    static int[] dist;
    static int N,M;
    static BufferedWriter bw;


    static class Node implements Comparable<Node>{
        private int now;
        private int cost;

        public Node(int now, int cost) {
            this.now = now;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost-o.cost;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        list = new ArrayList<>();

        for(int i=0; i<=N; i++){
        list.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            list.get(start).add(new Node(end,price));
        }

        for(int i=1; i<N+1; i++){
            djikstra(i);
            bw.write("\n");
        }

        bw.close();

    }

    static void djikstra(int start) throws IOException {
        dist = new int[N+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start] = 0;

        pq = new PriorityQueue<>();
        pq.add(new Node(start,0));

        while(!pq.isEmpty()){
            Node current = pq.poll();

            for(Node next : list.get(current.now)){
                if(dist[next.now] > next.cost+dist[current.now]){
                    dist[next.now]= next.cost+dist[current.now];
                    pq.add(new Node(next.now, dist[next.now]));
                }
            }

        }

        for(int i=1; i<dist.length; i++){
            if(dist[i]==Integer.MAX_VALUE){
                bw.write("0 ");
            }else{
                bw.write(String.valueOf(dist[i])+" ");
            }
        }
    }
}
