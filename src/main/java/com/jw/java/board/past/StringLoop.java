package com.jw.java.board.past;

import java.io.*;
import java.util.StringTokenizer;

public class StringLoop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        for(int i = 0; i< a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String[] list = st.nextToken().split("");

            for(int j=0; j<list.length; j++){
               for (int k=0; k<num; k++){
                   bw.write(list[j]);
               }
            }
            bw.write("\n");
        }

        bw.close();
        br.close();
    }
}
