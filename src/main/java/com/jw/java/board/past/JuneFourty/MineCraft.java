package com.jw.java.board.past.JuneFourty;

import java.io.*;
import java.util.StringTokenizer;

public class MineCraft {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st  = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] ground = new int[N][M];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                int num = Integer.parseInt(st.nextToken());
                ground[i][j] = num;
                if(num>max) max =num;
                if(num<min) min = num;
            }}
        int minCount =Integer.MAX_VALUE;
        int hegiht = 0;
        for(int i=min; i<=max; i++){
                int num = i;
                int count =0;
                int bag = K;
            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                    int block = ground[j][k];

                    if(block>num){
                        count+=((block-num)*2);
                        bag+=(block-num);
                    }
                    else if(block<num){
                            count+=num-block;
                            bag-=(num-block);

                    }
                }
            }
                if(bag<0)break ;


                if(minCount>=count){
                    minCount=count;
                    hegiht=i;
                }

        }
        bw.write(String.valueOf(minCount)+" "+String.valueOf(hegiht));
        bw.close();





    }
}
