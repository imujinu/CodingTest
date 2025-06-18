package com.jw.java.board.June.JuneSeventeen;

import java.io.*;

public class Sqrt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 1 = 1 2= 2 3= 3 4= 1 5=2 6=3 7 =4 8 =2 9 =1
        // 제곱수는 = 1, 그 다음 값은 제곱수 +1, 그 다다음 값들은
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[Math.max(4,N+1)];
        list[0]= 0;
        list[1] = 1;
        list[2] = 2;
        list[3] = 3;
        for(int i=4; i<=N; i++){
            list[i] = list[i-1]+1;
            for(int j=2; j*j<=i; j++){
               int sqr = j*j;
               list[i] = Math.min(list[i], list[i-sqr]+1);

            }
        }
        bw.write(String.valueOf(list[N]));
        bw.close();


    }
}
