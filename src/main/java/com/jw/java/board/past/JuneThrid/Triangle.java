package com.jw.java.board.past.JuneThrid;

import java.io.*;

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N ; i++){
            int M = Integer.parseInt(br.readLine());
        if(M<4)bw.write("1\n");
        else if(M==4 || M==5)bw.write("2\n");
        else{
            int[] numbers = new int[M];
            numbers[0] = 1;
            numbers[1] = 1;
            numbers[2] = 1;
            numbers[3] = 2;
            numbers[4] = 2;
            for(int j=5; j<M; j++){
                numbers[j] = numbers[j-1]+numbers[j-5];
            }
            bw.write(String.valueOf(numbers[M-1])+"\n");
        }
        }
        bw.close();
        br.close();
    }
}
