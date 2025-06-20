package com.jw.java.board.June.Tweinty;

import java.io.*;
import java.util.StringTokenizer;

public class Nm {
    static int N,M;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb;

    static void dfs(int depth){
        if(depth==M){
            for(int i : arr){
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<N; i++){
            if (!visited[i]){
                visited[i] =true;
                arr[depth] = i+1;
                dfs(depth+1);
                visited[i] =false;
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr= new int[M];
        visited = new boolean[N];

        dfs(0);

        System.out.println(sb);


    }
}
