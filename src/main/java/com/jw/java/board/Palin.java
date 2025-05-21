package com.jw.java.board;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Palin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String st = br. readLine();
            int number = Integer.parseInt(st);

            if(number==0) break;

            String reverseNumber = new StringBuilder(st).reverse().toString();

            if(st.equals(reverseNumber))bw.write("yes" + "\n");
            else bw.write("no"+"\n");
        }
        bw.close();
        br.close();

    }
}
