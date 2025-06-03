package com.jw.java.board.JuneThrid;

import java.io.*;

public class Grape {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] drink = new int[N];
        int[] value = new int[N];
        for(int i=0; i<N; i++){
            drink[i] = Integer.parseInt(br.readLine());
        }

        if(N==1)bw.write(String.valueOf(drink[0]));
        else if(N==2)bw.write(String.valueOf(drink[0] + drink[1]));
        else{
            value[0] = drink[0];
            value[1] = drink[0] + drink[1];
            value[2] = Math.max(Math.max(drink[0]+drink[2],value[1]),drink[1]+drink[2]);
        for(int i =3; i<N; i++){
            value[i] = Math.max(Math.max(value[i-2]+drink[i], value[i-3]+drink[i-1]+drink[i]),value[i-1]);
        }
        bw.write(String.valueOf(value[N-1]));
        }

        bw.close();
        br.close();
    }
}
