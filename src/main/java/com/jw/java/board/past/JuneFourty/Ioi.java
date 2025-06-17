package com.jw.java.board.past.JuneFourty;

import java.io.*;

public class Ioi {
    public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    String string = br.readLine();
    int count =0 ;
    int temp =0;

        for (int i = 1; i < M - 1; i++) {
            if (string.charAt(i - 1) == 'I' && string.charAt(i) == 'O' && string.charAt(i + 1) == 'I') {
                temp++;
                if (temp == N) {
                    count++;
                    temp--;
                }
                i++;
            } else {
                temp = 0;
            }
        }

        bw.write(String.valueOf(count));
    bw.close();




    }
}
