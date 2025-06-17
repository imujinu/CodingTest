package com.jw.java.board.past.MayTwentySeven;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Yose {

    public static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        bw.write("<");
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i =1; i<=N; i++){
            deque.add(i);
        }

        while (!deque.isEmpty()) {
            for (int i =1; i<=M-1; i++){
                int a = deque.poll();
                deque.add(a);

            }
            if(deque.size()==1) bw.write(String.valueOf(deque.poll()));
            else{
                bw.write(String.valueOf(deque.poll())+", ");
            }
        }

        bw.write(">");
        bw.close();
        br.close();
        //1234567 124567 12457 1457 145 14 4
    }
}
