package com.jw.java.board.JuneSeventeen;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Yose {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        sb.append("<");
        for(int i=1; i<=N; i++){
            queue.add(i);
        }

        while (queue.size()>1){
            for(int i=0; i<M-1; i++){
                int n = queue.poll();
                queue.add(n);
            }
            int num = queue.poll();
            sb.append(num+", ");
        }

        sb.append(queue.poll()+">");
        bw.write(sb.toString());
        bw.close();



    }
}
