package com.jw.java.board.July.Week2;

import java.io.*;
import java.util.*;

public class Line {
    static int N,M;
    static List<List<Integer>> list;
    static StringBuilder sb;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N+1];
        list = new ArrayList<>();
        sb = new StringBuilder();
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.get(start).add(end);
            arr[end]++;
        }


        topological();
        System.out.println(sb);

    }
    static void topological(){
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=N; i++ ){
            if(arr[i]==0){

                queue.add(i);
            }
        }

        while (!queue.isEmpty()){
            int temp = queue.poll();
            sb.append(temp).append(" ");
            for(int next : list.get(temp)){
                arr[next]--;

                if(arr[next]==0){
                    queue.add(next);
                }
            }
        }

    }
}
