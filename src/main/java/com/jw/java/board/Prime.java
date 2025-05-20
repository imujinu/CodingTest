package com.jw.java.board;

import java.io.*;
import java.util.StringTokenizer;

public class Prime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int range = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum =0;
        for(int i =0; i<range; i++){
            Boolean isPrime = true;
            int number = Integer.parseInt(st.nextToken());

            if(number<2) continue;

            for (int j=2; j<Math.sqrt(number); j++){
                if(number%j==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)sum++;
        }
        bw.write(sum);
        bw.close();
        br.close();
    }
}
