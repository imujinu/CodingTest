package com.jw.java.board.past.MayThirty;

import java.io.*;

public class Stair {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] stairList = new int[N];
        for(int i=0; i<N; i++){
            stairList[i]= Integer.parseInt(br.readLine());
        }

        int[] list = new int[N];
        if(N==1){
            bw.write(String.valueOf(stairList[0]));
        }
        else if(N==2){
            bw.write(String.valueOf(stairList[0]+stairList[1]));
        }
        else {

        list[0] = stairList[0];
        list[1]= stairList[0]+stairList[1];
        list[2] = Math.max(stairList[0]+stairList[2],stairList[2]+stairList[1]);
        for(int i =3; i<N; i++){
            list[i] = Math.max(  list[i - 2] + stairList[i], list[i - 3] + stairList[i - 1] + stairList[i]);
        }

        bw.write(String.valueOf(list[N-1]));
        }
        bw.close();
        br.close();




    }
}
