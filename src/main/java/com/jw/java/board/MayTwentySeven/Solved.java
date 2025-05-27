package com.jw.java.board.MayTwentySeven;

import java.io.*;
import java.net.Inet4Address;
import java.util.*;

public class Solved {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = (int) ( Math.round(N*0.15)) ;
        int J = N- (2*M);
        Integer[] numbers = new Integer[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            numbers[i] = number;
        }
        Arrays.sort(numbers);

        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(numbers));

        for(int i =0; i< M; i++){
            deque.poll();
            deque.pollLast();
        }

        int sum = 0;
        double avg = 0;
        for(int num : deque){
            sum+=num;
        }
        if(!deque.isEmpty()){


        avg = Math.round((double) sum/deque.size());
        }

        bw.write(String.valueOf((int)avg));
        bw.close();
        br.close();
    }}
