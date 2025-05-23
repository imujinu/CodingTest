package com.jw.java.board.past;

import java.io.*;
import java.util.StringTokenizer;

public class Hotel2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int range = Integer.parseInt(br.readLine());

        for(int i= 0 ; i<range; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int floor = n%h==0 ? h: n%h;
            int room =  n%h==0? (n/h) : n/h+1;

            bw.write(floor + String.format("%02d", room) + "\n");
        }
        bw.close();
        br.close();
    }
}
