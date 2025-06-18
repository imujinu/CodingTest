package com.jw.java.board.June.JuneSeventeen;

import java.io.*;
import java.util.*;

public class Snake {
    static int[] map;
    static boolean[] visited;
    static HashMap<Integer,Integer> ladder;
    static int minCount ;
    static void dfs(int start, int count){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start,count});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int n = arr[0];
            int cnt = arr[1];
            if(n==100){
                minCount =cnt;
                return;
            }

            for (int i = 1; i < 7; i++) {
                int next = n+i;
                if (next > 100) continue;
                if(ladder.containsKey(next)){
                    next = ladder.get(next);
                }

                if(!visited[next]){
                    visited[next] = true;

                queue.add(new int[]{next, cnt + 1});
                }


            }

        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new int[101];
        for(int i=1; i<=100; i++){
            map[i]=i;
        }

        visited = new boolean[101];
        ladder =new HashMap<>();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            ladder.put(num1,num2);
        }


        for(int i=0; i<M; i++){
            st=  new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            visited[num1] = false;
        }

        dfs(1,0);
        bw.write(String.valueOf(minCount));
        bw.close();


    }
}
