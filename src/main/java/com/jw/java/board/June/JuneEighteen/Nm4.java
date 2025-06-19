package com.jw.java.board.June.JuneEighteen;

import java.io.*;
import java.util.StringTokenizer;

public class Nm4 {
    static int[] arr;
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
            //i는 출발 노드를 의미
            //출발 노드가 동적으로 변해야 하니까 인자인 start를 받아서 초기화해줌.
            //dfs는 출발 노드와 똑같은 값부터 시작하니까 i를 그대로 넘겨준다.

            arr[depth] = i+1;
            dfs(i,depth+1);
        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
       arr = new int[M];
       sb = new StringBuilder();

       dfs(0,0);
        System.out.println(sb);
    }
}
