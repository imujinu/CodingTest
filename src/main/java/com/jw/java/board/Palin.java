package com.jw.java.board;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Palin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0; i<br.readLine().length(); i++)
        {
            StringTokenizer st= new StringTokenizer(br.readLine());
            list.add(Integer.parseInt(st.nextToken()));
        }
        while (true){

            ArrayList<Integer> reversedList = new ArrayList<>(list);
            Collections.reverse(reversedList);

            if(list.get(0).equals(0)) break;

            if (list.equals(reversedList)) {
               bw.write("yes"+"\n");
            }else bw.write("wrong"+"\n");
        }
        bw.close();
        br.close();

    }
}
