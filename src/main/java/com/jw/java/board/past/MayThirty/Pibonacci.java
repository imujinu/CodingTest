package com.jw.java.board.past.MayThirty;

import java.io.*;

public class Pibonacci {
    static int[][] numbers = new int[41][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        numbers[0][0] =1;
        numbers[0][1] = 0;
        numbers[1][0] = 0;
        numbers[1][1]=1;

        for(int i=0; i<N; i++){
            int M = Integer.parseInt(br.readLine());
        for(int j =2; j<=M; j++){
            numbers[j][0] = numbers[j-1][0] + numbers[j-2][0];
            numbers[j][1] = numbers[j-1][1] + numbers[j-2][1];
        }
        bw.write(numbers[M][0] + " " + numbers[M][1] + "\n");
        }

        bw.close();
        br.close();
    }
}

//2 는 1+0
//3은 2+1
//반복문을 돌리며 각 인덱스 번호에 맞는
