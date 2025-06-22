package com.jw.java.board.June.Tweinty;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Bag {
    static List<List<Node>> list;
    static int N,M;
    static class Node implements Comparator<Node>{
        private int weight;
        private int price;

        Node(int weight, int price){
            this.weight = weight;
            this.price = price;
        }

        @Override
        public int compare(Node o1, Node o2) {
            return o1.price - o2.price;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br. readLine());
        list = new ArrayList<>();
        for(int i=0; i<M; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            list.add(new ArrayList<>(new Node(weight, price)));
        }

    }
}
