package com.jw.java.board.July.Week1.Friday;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Country {
    static int N, M;
    static List<Node> list;
    static int[] parents;

    static class Node implements Comparable<Node>{
        int id;
        int next;
        int value;

        public Node(int id,int next, int value) {
            this.id = id;
            this.next = next;
            this.value = value;
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
        list = new ArrayList<>();


        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            list.add(new Node(start,end,value));
        }

        Collections.sort(list);
        parents = new int[N+1];

        for(int i=1; i<=N; i++){
            parents[i] = i;
        }

        int sum =0;
        int max = 0;

        for(int i=0; i<list.size(); i++){
            int now = list.get(i).id;
            int next = list.get(i).next;
            int value = list.get(i).value;

            if(union(now,next)){
                sum+=value;
                max = Math.max(max,value);
            }

        }

        bw.write(String.valueOf(sum-max));
        bw.close();

    }
    static boolean union(int now, int next){
        int nowParent= find(now);
        int nextParent= find(next);

        if(nowParent!=nextParent){
            parents[nextParent] = nowParent;
            return true;
        }

        return false;
    }
    static int find(int temp){
        if(temp!=parents[temp]){
            parents[temp] = find(parents[temp]);
        }
            return parents[temp];

    }
}
