package com.jw.java.board.June.Tweinty;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Lotto {
    static int[]numbers;
    static ArrayList<Integer> list;
    static boolean[] visited;
    static StringBuilder sb;
    static int N;
    static void dfs(int start, int depth){
        if(depth==6){
            for(int i : list){
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=start; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                list.add(numbers[i]);
                dfs(i+1, depth+1);
                list.remove(list.size()-1);
                visited[i]=false;
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String temp = br.readLine();
            if(temp.equals("0")) {
                 break;
            }else {
                StringTokenizer st=new StringTokenizer(temp);
                System.out.println(temp);
                sb = new StringBuilder();
                N = Integer.parseInt(st.nextToken());
                numbers = new int[N];
                visited = new boolean[N];
                list = new ArrayList<>();
                for(int i=0; i<N; i++){
                    int num = Integer.parseInt(st.nextToken());
                    numbers[i] =num;
                }
                System.out.println("array:"+Arrays.toString(numbers));
                dfs(0,0);
                System.out.println(sb);
            }
        }

    }
}
