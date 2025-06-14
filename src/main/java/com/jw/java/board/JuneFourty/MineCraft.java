package com.jw.java.board.JuneFourty;

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
                max = Math.max(max, num);
                min = Math.min(min,num);
            }
        }
        int maxCount = 0;
        int minCount = 0;
            for(int[] nums : ground){
                for(int num : nums){
                    if(num!=max){
                        maxCount += max-num;
                    }
                }
            }

            for(int[] nums: ground){
                for (int num: nums){
                    if(num!=min){
                        minCount+= (num-min)*2;
                    }
                }
            }

            if(maxCount<minCount && maxCount<K){
                bw.write(String.valueOf(maxCount)+" "+String.valueOf(max));
            }else{
                bw.write(String.valueOf(minCount)+" "+String.valueOf(min));
            }
            bw.close();







    }
}
