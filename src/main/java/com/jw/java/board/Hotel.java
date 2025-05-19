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
            int guestNumber = Integer.parseInt(st.nextToken());

            int floor = guestNumber%h;
            int roomNumber = guestNumber/h+1;

            if(floor==0){
                floor=h;
                roomNumber--;
            }

            bw.write(floor + String.format("%02d", roomNumber) + "\n");
        }
        bw.close();
        br.close();
    }
}
