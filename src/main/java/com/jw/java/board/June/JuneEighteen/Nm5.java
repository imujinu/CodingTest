package com.jw.java.board.June.JuneEighteen;

import java.io.*;
import java.util.*;

public class Nm5 {
    static int[] arr;
    static boolean[] visited;
    static ArrayList<Integer> list;
    static int N,M;
    static StringBuilder sb;

    static void dfs(int depth){
        if(depth==M){
            for(int n : arr){
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<N; i++){
            if(!visited[i]){
                visited[i]=true;
            arr[depth] = list.get(i);
            dfs(depth+1);
               visited[i]=false;
            }

        }



    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        visited = new boolean[N];
        sb = new StringBuilder();
        list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }
        Collections.sort(list);

        dfs(0);

        System.out.println(sb);

    }
}
