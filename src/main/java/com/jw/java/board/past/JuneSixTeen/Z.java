package com.jw.java.board.past.JuneSixTeen;

import java.io.*;
import java.util.StringTokenizer;

public class Z {
        static int count;
        static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int length = (int)Math.pow(2,N);
        map=new int[length][length];
        loop(0,0, length);
//        for(int i=0; i<length; i++){
//            for(int j=0; j<length; j++){
//                System.out.print(map[i][j]);
//            }
//            System.out.println();
//        }
        bw.write(String.valueOf(map[M][K]));
        bw.close();
    }
    static void loop(int y, int x, int length){
        if(length == 1){
            map[y][x] = count++;
            return;
        }

        int nextLength = length/2;

        loop(y,x,nextLength);
        loop(y,x+nextLength, nextLength);
        loop(y+nextLength,x, nextLength);
        loop(y+nextLength,x+nextLength, nextLength);

    }

}
