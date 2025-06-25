package com.jw.java.board.June.TwentyFive;


import java.io.*;
import java.util.*;

public class Range {
    static int N,M, start;
    static List<List<Node>> list;
    static int[] dist;
    static PriorityQueue<Node> pq;

    static class Node implements Comparable<Node>{
        private int now;
        private int value;

        Node(int now, int value){
            this.now = now;
            this.value = value;
        }

        @Override
        public int compareTo(Node o){
            return this.value-o.value;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(br.readLine());
        list = new ArrayList<>();

        for(int i=0; i<=N; i++){
         list.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int now = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int value= Integer.parseInt(st.nextToken());
            list.get(now).add(new Node(end,value));
        }

        dist= new int[N+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start] = 0;

        pq = new PriorityQueue<>();
        pq.add(new Node(start,0));

        while(!pq.isEmpty()){
            Node current = pq.poll();

            for(Node next : list.get(current.now)){
                // now에 연결된 Node를 가져온다.
                if(dist[next.now]>dist[current.now]+next.value){
                    dist[next.now] = dist[current.now]+next.value;
                    pq.add(new Node(next.now, dist[next.now]));
                }

            }

        }
        for(int i=1; i<=N; i++){
            if(dist[i]==Integer.MAX_VALUE){
                bw.write("INF\n");
            }
            else{
                bw.write(String.valueOf(dist[i])+"\n");
            }
        }

        bw.close();
    }
}
