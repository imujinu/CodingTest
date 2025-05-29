package com.jw.java.board.MayTwentySeven;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class NumberStack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int push=1;
        Boolean isTrue =true;
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());

            while(push<=number){
                stack.add(push++);
                sb.append("+\n");
            }


            if(!stack.isEmpty()&& number==stack.peek()){
                stack.pop();
                sb.append("-\n");
            }
            else{
                isTrue=false;
                break;
            }
        }
        bw.write(isTrue? sb.toString():"NO");
        bw.close();
        br.close();
    }
}
