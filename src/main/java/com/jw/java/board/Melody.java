package com.jw.java.board;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Melody {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Boolean ascending = true;
        Boolean descending = true;

        for (int i=0; i<list.length-1; i++){
            if(list[i]<list[i+1])descending=false;
            else if(list[i]>list[i+1])ascending=false;
            else{
                ascending=false;
                descending=false;
            }
        }
        bw.write(ascending? "ascending" : descending?  "descending" : "mixed");
        bw.close();
        br.close();



    }
}
