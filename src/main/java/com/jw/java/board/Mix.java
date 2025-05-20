package com.jw.java.board;

import java.io.*;
import java.util.StringTokenizer;

public class Mix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        for(int i = 0; i<number; i++){
            int num = i;
            int sum = 0;

            while(num!=0){
                sum+=num%10;
                num/=10;
            }

            if (i+sum == number){

                bw.write(String.valueOf(i));
                break;
            }
            else bw.write("0");

        }
        bw.close();
        br.close();


    }
}
