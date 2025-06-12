package com.jw.java.board.JuneTwelve;

import java.io.*;

public class Parent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split("-");
        String[][] string = new String[str.length][];
        for(int i=0; i<str.length; i++){
            string[i]=str[i].split("\\+");
        }
        int sum =0;
        for(int i=0; i<string.length; i++){
            for(int j=0; j<string[i].length; j++){
                if(i==0)sum+=Integer.parseInt(string[i][j]);
                else {
                    sum -= Integer.parseInt(string[i][j]);
                }
            }
        }
        bw.write(String.valueOf(sum));
        bw.close();
        br.close();
    }
}
