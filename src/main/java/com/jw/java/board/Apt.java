package com.jw.java.board;

import java.io.*;

public class Apt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());

        for(int i =0; i<number; i++){
            int h = Integer.parseInt(br.readLine());
            int x = Integer.parseInt(br.readLine());

            int[][] apt = new int[h+1][x+1];
            for(int j =0; j<=x; j++){
                apt[0][j] = j;
            }

            for(int j=0; j<=h; j++){
                apt[j][1] = 1;
            }

            for(int j=1; j<=h; j++){
                for( int k=2; k<=x; k++){
                    apt[j][k] = apt[j][k-1] + apt[j-1][k];
                }
            }

            String home = String.valueOf(apt[h][x]);

            bw.write(home+"\n");


        }
            bw.close();
            br.close();




    }
}
