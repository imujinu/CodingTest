package com.jw.java.board.past;

import java.io.*;
import java.util.*;

public class Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int range = Integer.parseInt(br.readLine());
        int[] list = new int[range];

        for(int i =0; i<range; i++){
            list[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(list);

        for(int number : list){
            bw.write(number + "\n");
        }

        br.close();
        bw.close();

    }
}
