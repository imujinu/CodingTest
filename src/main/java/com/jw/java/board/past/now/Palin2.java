package com.jw.java.board.past.now;

import java.io.*;

public class Palin2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String str = br. readLine();
            int number = Integer.parseInt(str);

            if(number==0)break;

            String reverse = new StringBuilder(str).reverse().toString();

            if(str.equals(reverse))bw.write("yes"+"\n");
            else bw.write("no"+"\n");
        }
        bw.close();
        br.close();


    }
}
