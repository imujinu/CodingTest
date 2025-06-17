package com.jw.java.board.past.now;

import java.io.*;
import java.util.*;

public class ArrayRamda {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        String[][] list= new String[a][2];

        for(int i =0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[i][0] = st.nextToken();
            list[i][1] = st.nextToken();


        }
        Arrays.sort(list,(o1, o2)->Integer.parseInt(o1[0])-Integer.parseInt(o2[0])

        );

        for(int i =0; i<a; i++){
            bw.write(list[i][0] + " " +list[i][1]+"\n");
        }
        bw.close();
        br.close();

    }
}
