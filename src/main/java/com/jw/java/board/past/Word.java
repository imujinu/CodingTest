package com.jw.java.board.past;

import java.io.*;

public class Word {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strings = br.readLine().trim().split(" ");

        if(strings[0].equals(""))bw.write("0");
        else{

        bw.write(String.valueOf(strings.length));
        }
        bw.close();


    }
}
