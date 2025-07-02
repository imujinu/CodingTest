package com.jw.java.board.July.Week1.Tuesday;

import java.io.*;
import java.util.*;

public class NumArr4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }


        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){
                if(arr[j]<arr[i] && list.get(j).size()> list.get(i).size()){
                  list.set(i,new ArrayList<>(list.get(j)));
                }
            }
            list.get(i).add(arr[i]);
        }

        int maxLen = 0;
        int idx = 0;
        for (int i = 0; i < N; i++) {
            if (list.get(i).size() > maxLen) {
                maxLen = list.get(i).size();
                idx = i;
            }
        }

        bw.write(String.valueOf(maxLen)+"\n");

        for(int i : list.get(idx)){
            bw.write(String.valueOf(i+" "));
        }
        bw.close();
    }
}
