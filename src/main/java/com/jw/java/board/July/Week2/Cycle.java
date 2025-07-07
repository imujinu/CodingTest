package com.jw.java.board.July.Week2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Cycle {
    static List<Node> list;
    static int N,M;
    static int[] parents;
    static class Node implements Comparable<Node>{
        int id;
        int next;

        public Node(int id, int next) {
            this.id = id;
            this.next = next;
        }

        @Override
        public int compareTo(Node o) {
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.add(new Node(start,end));
        }

        parents = new int[N];
        for(int i=0; i<parents.length; i++){
            parents[i] = i;
        }

        int order =0;

        for(int i=0; i<list.size(); i++){
            int temp1 = list.get(i).id;
            int temp2 = list.get(i).next;

            if(union(temp1,temp2)){
                order=i+1;
            break;
            }
        }

        System.out.println(order);
    }

    static int find(int idx){
        if(idx != parents[idx]){
            parents[idx] = find(parents[idx]);
        }
        return parents[idx];
    }

    static boolean union(int a, int b){
        int temp1 = find(a);
        int temp2 = find(b);

        if(temp1==temp2){
            return true;
        }else{
         parents[temp2] = temp1;
        return false;
        }
    }

}
