package com.jw.java.board.June.TwentThree;

import java.io.*;
import java.net.Inet4Address;
import java.util.*;

public class ShortRagne {
    static int N,M;
    static List<List<Node>> list;
    static int[] distance;
    static int[] distance2;
    static int[] distance3;
    static PriorityQueue<Node> pq;
    static class Node implements Comparable<Node> {
        int node;
        int range;
        Node(int node, int range){
            this.node = node;
            this.range=range;
        }

        @Override
        public int compareTo(Node o) {
            return this.range-o.range;
        }
    }

    static int[] dijkstra(Node node){
        int[] dist = new int[N+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[node.node] = 0;

        pq = new PriorityQueue<>();
        pq.add(new Node(node.node,0));

        while (!pq.isEmpty()){
            Node tempNode = pq.poll();

            if (dist[tempNode.node] < tempNode.range) continue;

            for(Node node2 : list.get(tempNode.node)){
                if(dist[node2.node]> node2.range+tempNode.range){
                    dist[node2.node] = node2.range+tempNode.range;
                    pq.add(new Node(node2.node, dist[node2.node]));
                }
            }

        }

        return dist;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++){
            st =new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            int conn = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            list.get(idx).add(new Node(conn,value));
            list.get(conn).add(new Node(idx,value));
        }
        st = new StringTokenizer(br.readLine());

        int conn1 = Integer.parseInt(st.nextToken());
        int conn2 = Integer.parseInt(st.nextToken());

        distance = dijkstra(new Node(1,0));
        distance2 = dijkstra(new Node(conn1,0));
        distance3 = dijkstra(new Node(conn2,0));




        if (distance[conn1] == Integer.MAX_VALUE || distance2[conn2] == Integer.MAX_VALUE ||
                distance3[N] == Integer.MAX_VALUE || distance[conn2] == Integer.MAX_VALUE ||
                distance3[conn1] == Integer.MAX_VALUE || distance2[N] == Integer.MAX_VALUE) {
            bw.write("-1");
        } else {
            int result1 = distance[conn1]+distance2[conn2]+distance3[N];
            int result2 = distance[conn2]+distance3[conn1]+distance2[N];
            bw.write(String.valueOf(Math.min(result1, result2)));
        }
            bw.close();

    }
}
