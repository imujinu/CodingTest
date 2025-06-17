package com.jw.java.board.past.now;

import java.io.*;
import java.util.*;
public class Queue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        java.util.Queue<Integer> queue = new LinkedList<>();

        for(int i =1; i<=N; i++){
            queue.offer(i);
        }

        while(queue.size()>1){
            queue.poll();

            queue.add(queue.poll());
        }

        System.out.println(queue.poll());
    }
}
