package com.jw.java.board.June.Tweinty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lotto2 {
    static StringBuilder sb;
    static int[] arr;
    static int[] numbers;
    static int N,depth,start;
    static void dfs(int start, int depth){
        if(depth==6){
            for(int i: arr){
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=start; i<N; i++){
            arr[depth] = numbers[i];
            dfs(i+1,depth+1);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){

        String temp = br.readLine();

        if(temp.equals("0")){
            break;
        }else{
            sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(temp);
            N = Integer.parseInt(st.nextToken());
            arr = new int[6];
            numbers= new int[N];
            for(int i=0; i<N; i++){
                numbers[i] = Integer.parseInt(st.nextToken());
            }
            dfs(0,0);

            System.out.println(sb);
        }
        }
    }
}
