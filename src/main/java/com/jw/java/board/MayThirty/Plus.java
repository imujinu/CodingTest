package com.jw.java.board.MayThirty;

import java.io.*;

public class Plus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            int M = Integer.parseInt(br.readLine());
        int[] numbers = new int[Math.max(4,M+1)];
        numbers[1]= 1;
        numbers[2] = 2;


        for(int j =4; j<=M; j++){
            int sum = numbers[j-3]+numbers[j-2]+numbers[j-1];
            numbers[j] = sum;
        }


        bw.write(String.valueOf(numbers[M])+"\n");}

        bw.close();
        br.close();
    }
}

// 1 = 1, 2= 2 (1+1, 2) 3= (1+1+1, 1+2, 2+1, 3)
// 4
// 1을 만드는 방법 +3 , 2를 만드는 방법 +2 , 3을 만드는 방법 +1씩 더하기
// 그러므로 각 수를 만드는 방법만큼 더하면 됨
// N이라는 숫자를 N칸의 배열이라고 생각을 하면 된다. 그 빈칸을 모두 채워야 한다고 가정,
// 그렇지만 적어도 N-3칸까지는 채워져야 한다.
//why ? 채울 수 있는 크기의 최대가 3칸이므로.
// 예를 들어 N =4 라면
// [][][][] 끝이 3개 비어져있을 경우 2개 비어있을 경우 1개 비어있을 경우가 최대 경우의 수
// 4개가 비워져도 채울 수 없음
//