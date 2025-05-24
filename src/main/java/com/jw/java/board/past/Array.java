package com.jw.java.board.past;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Array {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int range = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<range; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        for(int number: list){
            bw.write(number+"\n");
        }
        bw.close();
        br.close();


    }
}
