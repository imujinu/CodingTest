package com.jw.java.board.past;

import java.io.*;

public class Star {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        for (int i=1; i<=number; i++){
            bw.write(String.format("%" + number + "s", "*".repeat(i)) + "\n");
        }
        br.close();
        bw.close();

    }
}
