package com.jw.java.board.past.JuneTen;

import java.io.*;

public class Square {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] number= new int[N+1];
        number[0]= 0;
        number[1] = 1;


        for(int i=2; i<=N; i++){
            number[i]= number[i-1];

            for(int j=1; j*j<=i; j++){
                number[i] = Math.min(number[i], number[i-j*j]);
            }

            number[i]++;
        }

        bw.write(String.valueOf(number[N]));
        bw.close();






    }
}
