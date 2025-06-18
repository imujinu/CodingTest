package com.jw.java.board.June.JuneEighteen;

import java.io.*;
import java.util.StringTokenizer;

public class Grape {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        int[] sum = new int[N];
        for(int i=0; i<N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        sum[0] = numbers[0];

        if(N==2){
            sum[1] = numbers[0]+numbers[1];
            bw.write(String.valueOf(sum[1]));
            bw.close();
            return;
        }
        if(N==3){
            sum[1] = numbers[0]+numbers[1];
            sum[2] = Math.max(numbers[0]+numbers[1],Math.max(numbers[1]+numbers[2],numbers[0]+numbers[2]));
            bw.write(String.valueOf(sum[2]));
            bw.close();
            return;
        }
        if(N>3){
            sum[1] = numbers[0]+numbers[1];
            sum[2] = Math.max(numbers[0]+numbers[1],Math.max(numbers[1]+numbers[2],numbers[0]+numbers[2]));
            for(int i=3 ; i<N; i++){
                sum[i] = Math.max(sum[i-2]+numbers[i],Math.max(sum[i-3]+numbers[i-1]+numbers[i],sum[i-1]));

            }

            bw.write(String.valueOf(sum[N-1]));
        }

        bw.close();

    }
}
