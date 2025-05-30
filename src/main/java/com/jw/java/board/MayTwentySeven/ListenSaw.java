package com.jw.java.board.MayTwentySeven;

import java.io.*;
import java.util.*;

public class ListenSaw {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> listen = new TreeSet<>();
        Set<String> saw = new TreeSet<>();

        for(int i=0; i<N ; i++){
            listen.add(br.readLine());
        }
        for(int i=0; i<M; i++){
            saw.add(br.readLine());
        }
        TreeSet<String> sum = new TreeSet<>();

        if(N>M){
            for(String name : saw){
                if(listen.contains(name))sum.add(name);
            }
        }else{
            for(String name : listen){
                if(saw.contains(name))sum.add(name);
            }
        }


        bw.write(String.valueOf(sum.size())+"\n");

        for(String name : sum){
            bw.write(name+"\n");
        }
        bw.close();
        br.close();
    }
}
