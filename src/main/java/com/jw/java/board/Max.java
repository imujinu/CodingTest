package com.jw.java.board;

import javax.imageio.IIOException;
import java.io.*;
import java.util.StringTokenizer;

public class Max {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        int idx = 0;
        for(int i=0; i<9 ; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());

            if(number>max){
                max =number;
                idx= i+1;
            }
        }
        bw.write(max + "\n");
        bw.write(String.valueOf(idx));

        br.close();
        bw.close();

    }
}
