package com.jw.java.board.June.TwentySeven;

import java.io.*;
import java.net.Inet4Address;
import java.util.*;

public class WormHall {
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
        int length = Integer.parseInt(br.readLine());

        for(int i=0; i<length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            list = new ArrayList<>();

            for(int j=0; j<=M; j++){
                list.add(new ArrayList<>());
            }

                //간선 정보 입력
            for(int j=0; j<M; j++){
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int value = Integer.parseInt(st.nextToken());
                list.get(start).add(new Node(end,value));
            }

            for(int j=0; j<K; j++){

            }

        }

    }

    static int[] dijkstra(int idx) {

        dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[idx] = 0;

        pq = new PriorityQueue<>();
        return new int[]{1,2};
    }
    }

