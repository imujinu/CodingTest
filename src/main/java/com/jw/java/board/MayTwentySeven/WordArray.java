package com.jw.java.board.MayTwentySeven;

import java.io.*;
import java.util.*;

public class WordArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashSet<String> setlist = new HashSet<>();


        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            setlist.add(st.nextToken());
        }

        ArrayList<String> list = new ArrayList<>(setlist);

        Collections.sort(list, (a,b)->{
            int length = a.length()-b.length();
            if(length!=0){
                return length;
            }else{
                return a.compareTo(b);
            }
        });

        for(String str : list){
            bw.write(str+"\n");
        }

        bw.close();
        br.close();
    }
}
