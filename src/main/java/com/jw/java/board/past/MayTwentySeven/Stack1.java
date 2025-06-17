package com.jw.java.board.past.MayTwentySeven;

import java.io.*;
import java.util.*;

public class Stack1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i =0; i<N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
           if(str.equals("push")){
               int number = Integer.parseInt(st.nextToken());
               stack.add(number);
           }
           else if(str.equals("top")){
               if(!stack.isEmpty())bw.write(String.valueOf(stack.peek())+"\n");
               else{

               bw.write("-1\n");
               }

           }else if(str.equals("size")){
               bw.write(String.valueOf(stack.size())+"\n");

           }else if(str.equals("empty")){
               if(stack.isEmpty()) {
                   bw.write("1" + "\n");
               }else{

               bw.write("0"+"\n");
               }
           } else if (str.equals("pop")) {
               if(!stack.isEmpty()){

               int num = stack.pop();
               bw.write(String.valueOf(num)+"\n");
               }
               else{
                   bw.write("-1" + "\n");
               }
           }
        }

        bw.close();
        br.close();

    }
}
