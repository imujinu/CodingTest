package com.jw.java.board.July.Week2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Step {
    static List<Integer> list;
    static int[][][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(true){
            int num = Integer.parseInt(st.nextToken());
            if(num==0) break;
            else{
                list.add(num);
            }
        }
        dp = new int[5][5][list.size()];
        dp[0][0][0] = 0;
        int answer = walk(0,0,0);
        bw.write(String.valueOf(answer));
        bw.close();
    }

    static int walk(int l, int r, int i) {
        if (i == list.size()) return 0;
        if (dp[l][r][i] != 0) return dp[l][r][i];

        int next = list.get(i);
        int temp = Integer.MAX_VALUE;
        if(r!=next){
            temp = Math.min(temp, calc(l,next)+walk(next,r,i+1));
        }

        if(l!=next){
            temp = Math.min(temp, calc(r,next)+walk(l,next,i+1));
        }
        dp[l][r][i] = temp;
        return temp;

    }

    static int calc(int start, int end){
        if(start==0) return 2;
        if(start==end) return 1;
        else if(Math.abs(start-end)==2) return 4;
        else {
            return 3;
        }
    }
}
