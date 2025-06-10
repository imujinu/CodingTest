package com.jw.java.board.JuneTen;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Fruit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            int M = Integer.parseInt(st.nextToken());
            map.put(M, map.getOrDefault(map.values(),0)+1);
        }
    }
}
