package com.jw.java.board.June.Tweinty;

import java.io.*;
import java.util.*;

public class City3 {
    static int[] cityList;
    static List<List<Node>> busList;
    static int N,M;
    static int[] distance;
    static PriorityQueue<Integer> pq;

    static class Node implements Comparable<Node>{
        private int node;
        private int cost;

        Node(int node, int cost){
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
        busList = new ArrayList<>();
        for(int i=0;i< M+1; i++){
            busList.add(new ArrayList<>());
        }
        for(int i=0; i<M+1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            busList.get(start).add(new Node(end,cost));
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int startIdx = Integer.parseInt(st.nextToken());
        int endIdx = Integer.parseInt(st.nextToken());
        distance = new int[N+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[startIdx] = 0;

        pq = new PriorityQueue<>();
        pq.add(startIdx);

        while(!pq.isEmpty()){
            int currentIdx = pq.poll();

            for(Node node : busList.get(currentIdx)){
                if(distance[node.node]>distance[currentIdx] + node.cost){
                    distance[node.node] = distance[currentIdx] + node.cost;
                    pq.add(node.node);
                }
            }

        }

        System.out.println(distance[endIdx]);
    }
}
