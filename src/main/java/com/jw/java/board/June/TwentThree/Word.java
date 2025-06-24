package com.jw.java.board.June.TwentThree;

import java.io.*;
import java.util.*;

public class Word {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new TreeSet<>((a,b)->{
            if(a.length()==b.length()){
                return a.compareTo(b);
            }else{
                return a.length()-b.length();
            }
        });
        for(int i=0; i<N; i++){
            set.add(br.readLine());
        }

        for(String str : set){
            System.out.println(str);
        }
    }
}
