package com.jw.java.board;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Alpha {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String alpha = br.readLine();

        int[] numbers = new int[26];

        for(int i = 0; i<numbers.length; i++){
            numbers[i] = -1;
        }

        for( int i = 0; i<alpha.length(); i++){
            char ch = alpha.charAt(i);
            int idx = ch - 'a';

            if(numbers[idx]==-1){
                numbers[idx] = i;
            }


        }

        for (int num : numbers){
            System.out.print(num+ " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
