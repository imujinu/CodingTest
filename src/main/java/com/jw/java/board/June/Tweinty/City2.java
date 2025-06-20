package com.jw.java.board.June.Tweinty;

import java.io.*;
import java.util.*;

public class City2 {
    static ArrayList<ArrayList<Node>> cityList;
    static int N,M;
    static int[] dist;
    static class Node implements Comparable<Node>{
        int node;
        int cost;

        public Node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
        @Override
        public int compareTo(Node node){
            return this.cost - node.cost;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            cityList= new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            cityList.get(n).add(new Node(m,k));
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        dist = new int[N+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start] = 0;

        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(start,0));

        while(!queue.isEmpty()){
            Node current = queue.poll();

            for(Node next : cityList.get(current.node)){
                if(dist[next.node] > dist[current.node]+ next.cost){
                    dist[next.node] = dist[current.node]+ next.cost;
                    queue.add(new Node(next.node, dist[next.node]));
                }

            }
        }




    }
}
