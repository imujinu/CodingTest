package com.jw.java.board.June.TwentySeven;

import java.io.*;
import java.util.*;

public class Seogang {
    static int N,M,K,Max;
    static List<List<Node>> list;
    static PriorityQueue<Node> pq;
    static int[] dist;
    static int[] item;

    static class Node implements Comparable<Node> {
        private int id;
        private int dis;

        Node(int id, int dis){
            this.id = id;
            this.dis = dis;
        }

        @Override
        public int compareTo(Node o){
            return this.dis-o.dis;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        item = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            item[i] = Integer.parseInt(st.nextToken());
        }
        list = new ArrayList<>();
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<K; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());
            list.get(start).add(new Node(end,length));
            list.get(end).add(new Node(start,length));
        }

        for(int i=1; i<=N; i++){
            dijkstra(i);
        }

        bw.write(String.valueOf(Max));
        bw.close();
    }

    static void dijkstra(int start){
        dist = new int[N+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start] = 0;

        pq = new PriorityQueue<>();
        pq.add(new Node(start,0));

        while(!pq.isEmpty()){
            Node current = pq.poll();
            for(Node next : list.get(current.id)){
                if(dist[next.id]>dist[current.id] + next.dis){

                dist[next.id] = dist[current.id]+ next.dis;
                pq.add(new Node(next.id, dist[next.id]));
                }
            }
        }

        int temp = 0;
        for(int i=1; i<=N; i++){
            if(dist[i]<=M ){
                temp += item[i];
            }
        }
        Max = Math.max(temp,Max);



    }
}
