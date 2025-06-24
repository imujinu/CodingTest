package com.jw.java.board.June.TwentThree;

import java.io.*;
import java.net.Inet4Address;
import java.util.PriorityQueue;

public class AbsHeap {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            if(Math.abs(a)== Math.abs(b)){
              return a-b;
            }else{
                return Math.abs(a)-Math.abs(b);
            }
        });
        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(br.readLine());

            if(temp ==0){
                if(pq.isEmpty()){
                    bw.write("0\n");
                }
                else{
                    bw.write(String.valueOf(pq.poll())+"\n");
                }
            }
            else{
                pq.add(temp);
            }
        }
        bw.close();

    }
}
