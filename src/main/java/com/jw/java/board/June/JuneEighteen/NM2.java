package com.jw.java.board.June.JuneEighteen;

import java.io.*;
import java.util.StringTokenizer;

public class NM2 {
     static int[] arr;
    static boolean[] visited;
    static int N,M;
    static StringBuilder sb;

    static void dfs(int start, int depth){
        if(depth==M){
            for(int n : arr){
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=start; i<N; i++){
                arr[depth] = i+1;
                dfs(i+1,depth+1);
        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr= new int[M];
        visited = new boolean[N];
        sb = new StringBuilder();
        dfs(0,0);
        System.out.println(sb);


    }
}
