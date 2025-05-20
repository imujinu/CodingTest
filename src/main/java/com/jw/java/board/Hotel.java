package com.jw.java.board;

import java.io.*;
import java.util.StringTokenizer;

public class Hotel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int range = Integer.parseInt(br.readLine());
        for (int i= 0; i<range ; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int guest = Integer.parseInt(st.nextToken());

            int floor = guest%h==0 ? h : guest%h;
            int roomNumber = guest%h == 0? guest/h : guest/h+1;



            bw.write(floor + String.format("%02d", roomNumber) + "\n");
        }
        bw.close();
        br.close();
    }
}
