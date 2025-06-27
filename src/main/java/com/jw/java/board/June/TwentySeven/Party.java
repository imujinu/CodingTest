package com.jw.java.board.June.TwentySeven;

import java.io.*;
import java.util.*;

public class Party {
    static int N,M,K;
    static int Max = Integer.MIN_VALUE;
    static int[] dist;
    static PriorityQueue<Node> pq;
    static List<List<Node>> list;

    static class Node implements Comparable<Node>{
        int id;
        int value;

        Node(int id, int value){
            this.id = id;
            this. value= value;
        }


        @Override
        public int compareTo(Node o) {
            return this.value-o.value;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();

        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            list.get(start).add(new Node(end,value));
        }

       int[] temp = dijkstra(K);

        for(int i=1; i<=N; i++){
            if(i==K)continue;
            int[] temp2 = dijkstra(i);
            Max = Math.max(Max, temp2[K]+temp[i]);
        }
        bw.write(String.valueOf(Max));
        bw.close();
    }

    static int[] dijkstra(int idx){

        dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[idx] = 0;

        pq = new PriorityQueue<>();
        pq.add(new Node(idx,0));

        while(!pq.isEmpty()){
            Node current = pq.poll();

            for(Node next : list.get(current.id)){
                if(dist[next.id]>next.value+dist[current.id]){
                    dist[next.id]=next.value+dist[current.id];
                    pq.add(new Node(next.id, dist[next.id]));
                }
            }
        }
     return dist;
    }
}
