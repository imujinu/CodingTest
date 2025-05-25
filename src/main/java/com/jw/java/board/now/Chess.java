package com.jw.java.board.now;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Chess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());


        String[][] chess = new String[x][y];

        for(int i =0; i<y; i++){
            for(int j =0; j<x; j++){
                new StringTokenizer(br.readLine());
                chess[i][j] = st.nextToken();
            }
        }
        int min = 0;

        for(int i =0; i<y-8 ; i++){
            int count =0;

            for(int j=0; j<x-8; j++){
                if(chess[i][j+8]==null || chess[i+8][j]==null)break;

                if(!(chess[i][j]+chess[i][j+1]).equals("BW") || !(chess[i][j]+chess[i][j+1]).equals("WB"))count++;


            }
        }

        bw.write(String.valueOf(min));
        bw.close();
        br.close();

        // BW || WB 가 최대로 등장하는 인덱스를
//        BW || WB가 최대로 등장 하는 8x8 형태의 배열


    }
}
