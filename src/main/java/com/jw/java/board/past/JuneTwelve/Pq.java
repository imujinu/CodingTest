package com.jw.java.board.past.JuneTwelve;

import java.io.*;
import java.util.PriorityQueue;

public class Pq {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<N; i++){
            int M = Integer.parseInt(br.readLine());
            if(M==0){
                if(pq.isEmpty())bw.write("0\n");
                else{
                    bw.write(String.valueOf(pq.poll())+"\n");
                }
            }
            else{
                pq.add(M);
            }
        }
        bw.close();
    }
}
