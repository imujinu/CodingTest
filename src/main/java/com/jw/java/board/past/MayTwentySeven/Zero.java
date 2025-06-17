package com.jw.java.board.past.MayTwentySeven;

import java.io.*;
import java.util.Stack;

public class Zero {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i =0; i<N; i++){
            int number = Integer.parseInt(br.readLine());

            if(number!=0){
            stack.add(number);

            }
            else if(number==0)stack.pop();

        }

        int sum=0;
        for(int num :stack) sum+=num;

        bw.write(String.valueOf(sum));
        bw.close();
        br.close();


    }
}
