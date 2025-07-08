package com.jw.java.board.July.Week2;

import java.io.*;
import java.util.*;

public class Acmcraft {
    static List<List<Integer>> list;
    static int[] dist, arr;
    static int N,M;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());

        for(int i=0; i<length; i++){
            StringTokenizer st  =new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arr = new int[N+1];
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++){
                arr[j]= Integer.parseInt(st.nextToken());
            }

            list = new ArrayList<>();
            for(int j=0; j<=N; j++){
                list.add(new ArrayList<>());
            }

            dist = new int[N+1];
            for(int j=0; j<M; j++){
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                list.get(start).add(end);

                dist[end]++;
            }

            int target = Integer.parseInt(br.readLine());

            dp = new int[N+1];
            topological();

            bw.write(String.valueOf(dp[target])+"\n");
        }

        bw.close();
    }
    static void topological(){
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=N; i++){
            if(dist[i]==0){
              queue.add(i);
              dp[i] = arr[i];
            }
        }

        while(!queue.isEmpty()){
            int temp = queue.poll();

            for(int i: list.get(temp)){

                dp[i] = Math.max(dp[i], dp[temp]+ arr[i]);
                dist[i]--;

                if(dist[i]==0){
                    queue.add(i);
                }
            }
        }


    }

}
