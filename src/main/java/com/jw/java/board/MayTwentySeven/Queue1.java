package com.jw.java.board.MayTwentySeven;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

           switch (str){
               case "push": int number = Integer.parseInt(st.nextToken()); deque.add(number);
                   break;
               case "front": if(!deque.isEmpty()) bw.write(String.valueOf(String.valueOf(deque.peek())+"\n"));else bw.write("-1\n"); break;
               case "back": if(!deque.isEmpty()) bw.write(String.valueOf(String.valueOf(deque.peekLast())+"\n"));else bw.write("-1\n"); break;
               case "size": bw.write(String.valueOf(deque.size())+"\n"); break;
               case"empty": if(deque.isEmpty()) bw.write(("1\n"));else bw.write("0\n"); break;
               case"pop": if(!deque.isEmpty()) bw.write(String.valueOf(String.valueOf(deque.poll())+"\n"));else bw.write("-1\n"); break;
               default:break;
           }
        }
           bw.close();
           br.close();
    }
}
