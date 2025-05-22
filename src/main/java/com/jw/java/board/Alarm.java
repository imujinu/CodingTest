package com.jw.java.board;

import java.io.*;
import java.util.StringTokenizer;

public class Alarm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(b<45){
            int hour = 60;
            if(a==0) a=23;
            else{
            a--;

            }
            b=b+hour-45;
            bw.write(a + " "+ b);
        }
        else{
            b=b-45;
            bw.write(a+ " "+b);
        }
        bw.close();
        br.close();
    }
}
