package com.jw.java.board.MayTwentySeven;

import java.io.*;
import java.net.Inet4Address;
import java.util.StringTokenizer;

public class Line {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[i]= Integer.parseInt(st.nextToken());
        }
        int start = 1;
        int max = 0;
        int count = 0;

        for(int num : list){
            if(num>max) max=num;
        }
        while (start <= max){
            int mid = start+max/2;

            if(count==11){
                bw.write(String.valueOf(mid));
                break;
            }

        }


    }
}
