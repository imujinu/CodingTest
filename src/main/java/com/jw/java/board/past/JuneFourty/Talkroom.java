package com.jw.java.board.past.JuneFourty;

import java.io.*;
import java.util.StringTokenizer;

public class Talkroom {
    static int[][] times;
    static int minCount,count;
    static boolean[] visited;
    static void check(int[] time){
        for(int i=0; i<times.length; i++){
            if(times[i][0]>time[1]){
                boolean isSame = false;
                for(int j=0; j<times.length; j++){
                    if(times[j][0]== times[i][0]){
                        isSame=true;
                    }else{
                        if(times[i][1]>times[j][1])check(times[j]);
                        else{
                            check(times[i]);
                        }
                    }
                }
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //시작 시간을 작은 순서로 정렬을 해
        int N = Integer.parseInt(br.readLine());
        times = new int[N][2];
        visited = new boolean[N+1];
        for(int i= 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            times[i][0] = start;
            times[i][1]= end;
        }
            minCount= Integer.MAX_VALUE;
        for(int i =0; i<times.length; i++){
            check(times[i]);
            if(minCount>count)minCount=count;
        }

    }
}
