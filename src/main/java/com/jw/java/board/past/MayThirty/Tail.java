package com.jw.java.board.past.MayThirty;

import java.io.*;

public class Tail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        if(N==1){
            bw.write("1");
        }
        else{

        int[] box = new int[N+1];
        box[1] = 1;
        box[2] = 2;

        for(int i=3; i<=N; i++){
        box[i] = (box[i-1]+box[i-2])%10007;
        }
        bw.write(String.valueOf(box[N]));
        }
        bw.close();
        br.close();

    }
}
