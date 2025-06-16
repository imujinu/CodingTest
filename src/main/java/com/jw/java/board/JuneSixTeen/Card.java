package com.jw.java.board.JuneSixTeen;

import java.io.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Card {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            set1.add(num);
        }
        int M = Integer.parseInt(br.readLine());
        st= new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){

            int num = Integer.parseInt(st.nextToken());
            set2.add(num);
        }

        for(int n : set2){
            if(set1.contains(n))sb.append("1 ");
            else sb.append("0 ");
        }

        System.out.println(sb.toString().trim());
    }
}
