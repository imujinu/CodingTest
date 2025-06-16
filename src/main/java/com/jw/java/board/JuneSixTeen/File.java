package com.jw.java.board.JuneSixTeen;

import java.io.*;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class File {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> treeMap = new TreeMap<>();
        for(int i=0; i<N; i++){
            String str = br.readLine();
            String name = str.split("\\.")[1];

            treeMap.put(name, treeMap.getOrDefault(name,0)+1);
        }

        for(String name : treeMap.keySet()){
            int value = treeMap.get(name);
            bw.write(name+ " " + value+ "\n");
        }

        bw.close();

    }
}
