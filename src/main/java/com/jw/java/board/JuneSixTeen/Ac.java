package com.jw.java.board.JuneSixTeen;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Ac {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str = br.readLine();
            char[] list = new char[str.length()];
            for(int j=0; j<str.length(); j++){
                list[j] = str.charAt(j);
            }
            int range = Integer.parseInt(br.readLine());
            String[] numbers = br.readLine().substring(1,-1).split(",");
            Arrays.asList(numbers);

            for(int j=0; j<list.length; j++){
                char ch = list[j];

//                if(ch=='R')
            }

        }

    }
}
