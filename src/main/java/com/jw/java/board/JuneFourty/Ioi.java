package com.jw.java.board.JuneFourty;

import java.io.*;
import java.util.*;

public class Ioi {
    public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    String string = br.readLine();

    int count =0;

    for(int i=0; i<M; i++){
        if(string.charAt(i)=='I'){
            int temp =0;
            for(int j=i+1; j<M-1; j++){
                if(string.charAt(j)=='O' && string.charAt(j+1)=='I'){
                    temp++;
                    j++;
                }
                if(temp==N){
                    count++;
                    temp--;
                }
            }

        }
    }


        bw.write(String.valueOf(count));
        bw.close();




    }
}
