package com.jw.java.board;

import java.io.*;
import java.util.*;


public class Word2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int range = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for(int i=0; i<range; i++){
            set.add(br.readLine());
        }

        ArrayList<String> list = new ArrayList<>(set);

        Collections.sort(list,(a,b)->{
            if(a.length()!=b.length()){
               return a.length()-b.length();
            }else{
                return a.compareTo(b);
            }

        });

        for(String word : list){
            bw.write(word+"\n");
        }

        bw.close();
        br.close();

    }
}





