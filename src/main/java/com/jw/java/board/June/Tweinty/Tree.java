package com.jw.java.board.June.Tweinty;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Tree {
    static boolean[] visited;
    static int[] result;
    static List<List<Integer>> list;
    static void dfs(int start){

        visited[start]=true;

        for(int i : list.get(start)){
            if(!visited[i]){
                result[i] = start;
                dfs(i);
            }
        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
       list = new ArrayList<>();

        for(int i=0; i<N+1; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<N-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            list.get(n).add(m);
            list.get(m).add(n);
        }

        visited = new boolean[N+1];
        result = new int[N+1];

        dfs(1);

        for(int i=2; i<N+1; i++){
            bw.write(String.valueOf(result[i])+"\n");
        }

        bw.close();
    }
}
