package com.jw.java.board.June.JuneSeventeen;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrQ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<N; i++){
            int n = Integer.parseInt(br.readLine());

            if(n==0){
                if(pq.isEmpty())bw.write("0\n");
                else{
                    bw.write(String.valueOf(pq.poll())+"\n");
                }
            }
            else {
                pq.add(n);
            }

        }
        bw.close();
    }
}
