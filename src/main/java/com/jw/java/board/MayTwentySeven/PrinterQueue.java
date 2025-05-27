package com.jw.java.board.MayTwentySeven;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class PrinterQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int range = Integer.parseInt(br.readLine());

        for(int i =0; i< range; i++){
            Deque<Integer> deque = new ArrayDeque<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                deque.add(Integer.parseInt(st.nextToken()));
            }
            if(M!=0){
            for(int j=0; j<M; j++){
                int a = deque.pop();
                deque.add(a);
            }
            }

            int number = deque.pop();
            int count = 1;
            for(int num : deque){
                if(num>number)count++;
            }
            bw.write(count+"\n");
        }
        bw.close();
        br.close();

        //주어진 것 총 숫자의 갯수와 현재 몇 번째 큐에 있는지




    }
}
