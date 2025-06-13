package com.jw.java.board.JuneFourty;

import com.jw.java.board.now.Array;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Talk {
    static int[][] times;
    static int count;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        times = new int[N][2];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            times[i][0]=start;
            times[i][1]=end;
        }
        Arrays.sort(times, (a,b)->{
            if(a[1]==b[1])return a[0]-b[0];
            else{
                return a[1]-b[1];
            }
        });
        int maxCount = 0;
        int end =0;
        for(int i =0; i< times.length; i++){
            if(times[i][0]>=end){
                end = times[i][1];
                maxCount++;
            }
        }

        bw.write(String.valueOf(maxCount));
        bw.close();
    }
}
