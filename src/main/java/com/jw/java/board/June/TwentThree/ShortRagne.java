package com.jw.java.board.June.TwentThree;

import java.io.*;
import java.net.Inet4Address;
import java.util.*;

public class ShortRagne {
    static int N,M;
    static List<List<Node>> list;
    static int[] distance;
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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();
        for(int i=0; i<M+1; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++){
            st =new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            int conn = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            list.get(i).add(new Node(conn,value));
        }
        st = new StringTokenizer(br.readLine());

        int conn1 = Integer.parseInt(st.nextToken());
        int conn2 = Integer.parseInt(st.nextToken());

        distance = new int[N+1];
        distance[1] = 0;

        pq = new PriorityQueue<>();
        pq.add(new Node(1,0));

        while (!pq.isEmpty()){
            Node node = pq.poll();

        }

    }
}
