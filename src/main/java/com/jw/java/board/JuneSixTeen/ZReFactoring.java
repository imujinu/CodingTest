package com.jw.java.board.JuneSixTeen;

import java.io.*;
import java.util.StringTokenizer;

public class ZReFactoring {
    static int[][] map;
    static int N,M,K;
    static int count,value;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int length =(int) Math.pow(2,N);
        //N>1보다 크다. N=2라면 2x2 즉 2의 제곱
        loop(0,0,length);

        bw.write(String.valueOf(value));
        bw.close();
    }

    static void loop(int y, int x, int length){
        if(length==1){
            if(y==M && x==K)value=count;
            count++;
            return;
        }

        int nextLength= length/2;
        //4등분씩 나눠줘야 하기 때문에 길이를 2로 나눈다.

       if(M<y+ nextLength && K < x+nextLength){
           loop(y,x,nextLength);
       }else if(M<y+ nextLength && K>= x+ nextLength){
           count+=nextLength*nextLength;
           loop(y,x+nextLength,nextLength);

       }else if(M>= y+nextLength && K<x+nextLength){
           count+=2*(nextLength*nextLength);
           loop(y+nextLength,x,nextLength);
       }else{
           count+=3*(nextLength*nextLength);
           loop(y+nextLength,x+nextLength,nextLength);
       }



    }
}
