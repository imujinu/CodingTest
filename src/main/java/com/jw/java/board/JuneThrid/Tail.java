package com.jw.java.board.JuneThrid;

import java.io.*;

public class Tail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] numbers = new int[Math.max(N+1, 3)];
        // N 배열을 기본 3으로 설정 그게 아니라면 N+1 값으로 설정
        numbers[1] = 1;
        numbers[2] = 3;
        if(N>2){

        for(int i=3; i<N+1; i++){
        numbers[i] = (numbers[i-1] + numbers[i-2]*2)%10007;
        }
        }
        bw.write(String.valueOf(numbers[N]));
        bw.close();
        br.close();
    }
}
