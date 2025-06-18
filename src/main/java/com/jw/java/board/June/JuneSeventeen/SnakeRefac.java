package com.jw.java.board.June.JuneSeventeen;

import java.io.*;
import java.util.*;

public class SnakeRefac {
    static int[] map;
    static boolean[] visited;
    static Map<Integer,Integer> ladder;
    static int count;

    static void bfs(int start){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start,0});
        visited[start] = false;

        while (!queue.isEmpty()){
            int[] arr = queue.poll();
            int x = arr[0];
            int cnt = arr[1];
            if(x==100){
                count = cnt;
                return;
            }

            for(int i=1; i<7; i++){
                int nextInt = x+i;
                if(nextInt==100){
                    queue.add(new int[]{nextInt,cnt+1});
                    break;
                }
                if(ladder.containsKey(nextInt)){
                    nextInt=ladder.get(nextInt);
                }
                if(!visited[nextInt]){
                    queue.add(new int[]{nextInt,cnt+1});
                    visited[nextInt] = true;
                }

            }

        }




    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        map = new int[101];
        visited= new boolean[101];
        ladder = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
             st = new StringTokenizer(br.readLine());
             int num1 = Integer.parseInt(st.nextToken());
             int num2 = Integer.parseInt(st.nextToken());
            ladder.put(num1,num2);
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            ladder.put(num1,num2);
        }

        bfs(1);
        bw.write(String.valueOf(count));
        bw.close();

    }
}
