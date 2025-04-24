package com.jw.java.board;

import java.io.*;

public class Barking1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int sum = func1(num);

        bw.write(String.valueOf(sum));

        br.close();
        bw.close();
    }
public static Integer func1(int num){
  int sum = 0;
  for(int i= 0; i< num; i++){
      if(i%3 == 0 || i%5==0){
          sum+=i;
      }
  }
      return sum;
}
}

