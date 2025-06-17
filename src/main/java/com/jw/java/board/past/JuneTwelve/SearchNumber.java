package com.jw.java.board.past.JuneTwelve;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class SearchNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N; i++){

            int number = Integer.parseInt(st.nextToken());
            set.add(number);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            int number = Integer.parseInt(st.nextToken());

            if(set.contains(number))bw.write("1\n");
            else{
                bw.write("0\n");
            }
        }
        bw.close();

    }
}
