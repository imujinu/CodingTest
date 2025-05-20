package com.jw.java.board;

import java.io.*;

public class Bee {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        int count = 1;
        int sum = 1;
      while(sum<number){
          sum+= 6*count;
          count++;
      }
       bw.write(String.valueOf(count));
        bw.close();
        br.close();

    }
}
