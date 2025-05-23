package com.jw.java.board.now;

import java.io.*;

public class Palin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){

            int a = Integer.parseInt(br.readLine());
            String[] num = Integer.toString(a).split("");
            int range = num.length-1;
            if(a==0)break;
            Boolean isPalin = true;
            for(int i=0; i<=range/2 ; i++){
                if(!num[i].equals(num[range-i]))isPalin=false;

            }
            bw.write(isPalin? "yes"+"\n": "no"+"\n");
        }
        bw.close();
        br.close();
    }
}
