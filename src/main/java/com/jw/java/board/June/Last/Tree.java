package com.jw.java.board.June.Last;

import java.io.*;
import java.util.*;

public class Tree {
    static int N;
    static List<List<int[]>> list;
    static List<List<Integer>> answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        list= new ArrayList<>();
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int len = Integer.parseInt(st.nextToken());
            list.get(start).add(new int[]{end,len});
        }
        answer = new ArrayList<>();
        dfs(1, new ArrayList<Integer>());
        

    }
    static void dfs(int start, List<Integer> temp){

        if(list.get(start).isEmpty()){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int[] arr : list.get(start)){
            temp.add(arr[1]);
            dfs(arr[0], temp);
            temp.remove(temp.size()-1);
        }
    }
}
