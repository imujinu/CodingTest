package com.jw.java.board.June.JuneEighteen;

import java.io.*;
import java.util.StringTokenizer;

public class Nm2Refactoring {
    static int N,M;
    static int[] arr;
    static StringBuilder sb;

    static void dfs(int start, int depth){
        if(depth == M){
            for(int n : arr){
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }

        //이전 값이 들어가면 안되니까 시작 지점을 늘려주면 된다.

        for(int i=start; i<N; i++){
            arr[depth] = i+1;
            dfs(i+1, depth+1);
            // i는 각 메서드 호출 시점의 값을 의미한다.
            // 1-2/3/4
            // 2-3/4
        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr= new int[M];
        sb = new StringBuilder();

        dfs(0,0);
        System.out.println(sb);

    }
}
