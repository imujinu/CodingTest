package com.jw.java.board.June.NineTeen;

import java.io.*;
import java.util.*;

public class Nm9 {
    static int N,M;
    static int[] arr;
    static boolean[] visited;
    static int[] result;
    static ArrayList<Integer> list;
    static StringBuilder sb;
    static Map<Integer,Integer> map;

    static void dfs(int depth){
        if(depth==M){
            for(int i : result){
                sb.append(i).append(" ");
;            }
            sb.append("\n");
            return;
        }
        int prev = 0;
        for(int i=0; i<N;i++){
            if(visited[i])continue;
            if(prev==arr[i])continue;
            visited[i]= true;
            prev=arr[i];
            result[depth] = arr[i];
            dfs(depth+1);
            visited[i]= false;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();
        arr = new int[N];
        visited = new boolean[N];
        result = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int n = Integer.parseInt(st.nextToken());
            arr[i] = n;
        }

        Arrays.sort(arr);

        dfs(0);

        System.out.println(sb);

    }
}
