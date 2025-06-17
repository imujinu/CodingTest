package com.jw.java.board.past.MayThirty;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Password {
    static int N,M;
    static HashMap<String, String> list = new HashMap<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //조건 1. 첫번째 주어지는 문자를 .을 없애고 맵에 넣기
        // 그 넣은 값을 다시 받아오면서
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i =0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            list.put(st.nextToken(), st.nextToken());
        }

        for(int i =0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            find(st.nextToken());
        }

        bw.write(sb.toString());
        bw.close();
        br.close();

    }

    static void find(String web){
        sb.append(list.get(web)).append("\n");
    }
}
