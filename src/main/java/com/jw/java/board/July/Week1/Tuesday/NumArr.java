package com.jw.java.board.July.Week1.Tuesday;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class NumArr {
    static int N, length;
    static int[] arr;
    static Stack<Integer> stack;

    static void dfs(int start){
        if(start==N){
            length = Math.max(stack.size(), length);
            return;
        }
        boolean check = false;
        if(stack.isEmpty()|| stack.peek()<arr[start]){
            stack.add(arr[start]);
            check=true;
        }
            dfs(start+1);
        if(check)stack.pop();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
           arr[i] = Integer.parseInt(st.nextToken());
        }
        stack = new Stack<>() ;

        dfs(0);
        bw.write(String.valueOf(length));
        bw.close();
    }
}
