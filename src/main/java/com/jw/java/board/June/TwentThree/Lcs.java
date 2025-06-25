package com.jw.java.board.June.TwentThree;

import java.io.*;
import java.util.Arrays;
import java.util.List;
public class Lcs {
    static Integer[][] dp;
    static char[] ch1;
    static char[] ch2;
    static int dfs(int y, int x){
        if(y==ch1.length || x==ch2.length)
            return 0;

        if(dp[y][x]==null){
            dp[y][x]=0;

            if(ch1[y]==ch2[x]){
                dp[y][x] = dfs(y+1,x+1)-1;
            }
            else{
                dp[y][x] = Math.min(dfs(y+1,x), dfs(y,x+1));
            }

        }

        return dp[y][x];



    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ch1 = br.readLine().toCharArray();
        ch2 = br.readLine().toCharArray();

        dp = new Integer[ch1.length][ch2.length];

        System.out.println(dfs(0, 0));


    }
}

