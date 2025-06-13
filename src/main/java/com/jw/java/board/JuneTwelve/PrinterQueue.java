package com.jw.java.board.JuneTwelve;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.StringTokenizer;

public class PrinterQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i =0; i<N; i++){
        int count =0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            Deque<Integer> deque = new ArrayDeque<>();

            for(int j =0; j<a; j++){
                int num = Integer.parseInt(st.nextToken());
                    deque.add(num);
            }

            int num =0 ;
            if(b!=0){

            for(int j=0; j<b; j++){
                if(j==b-1){
                    num = deque.poll();
                    break;
                }
                int temp= deque.poll();
                deque.add(temp);

            }
            }
            while(true){
               int temp =  deque.peek();
               if(temp<=num)deque.poll();
               else break;
            }

            while (!deque.isEmpty()){
                deque.pollLast();
                count++;
            }

            bw.write(String.valueOf(count)+"\n");
        }

            bw.close();

    }
}
