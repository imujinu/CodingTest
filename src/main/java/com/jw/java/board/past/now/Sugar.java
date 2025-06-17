package com.jw.java.board.past.now;

import java.io.*;

public class Sugar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int count =0;
        while(true){
            if(N%5==0) {
                count+=N/5;
                break;
            }else{
                N-=3;
                count++;
            }
            if(N<0){
                count = -1;
                break;
            }
        }


            bw.write(String.valueOf(count));

                bw.close();
                br.close();

    }
}
