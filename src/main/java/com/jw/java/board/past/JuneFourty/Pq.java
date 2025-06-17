package com.jw.java.board.past.JuneFourty;

import java.io.*;
import java.util.PriorityQueue;

public class Pq {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> prq = new PriorityQueue<>(
                (a,b) -> {
                    int absA = Math.abs(a);
                    int absB = Math.abs(b);

                    if(absA==absB) return a-b;
                    else return absA-absB;
                }
        );

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num!=0){
                prq.add(num);
            }
            else{
                if(prq.isEmpty()){
                    bw.write("0\n");
                }else{
                    bw.write(String.valueOf(prq.poll())+"\n");
                }
            }
        }

        bw.close();





    }
}
