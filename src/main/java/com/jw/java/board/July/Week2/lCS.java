package com.jw.java.board.July.Week2;

import java.io.*;

public class lCS {
    static String str1, str2;
    static Integer[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        str1 = br.readLine();
        str2 = br.readLine();
        dp = new Integer[str1.length()][str2.length()];
        traversal(str1.length()-1, str2.length()-1);
        System.out.println(dp[str1.length()-1][str2.length()-1]);

    }
    static int traversal(int y, int x){
        if(y<0 || x<0)return 0;

        if(dp[y][x]==null){
         dp[y][x] =0;

        if(str1.charAt(y)==str2.charAt(x)){
            dp[y][x] = traversal(y-1,x-1)+1;
        }else{
            dp[y][x] = Math.max(traversal(y-1,x),traversal(y,x-1));
        }

        }
        return dp[y][x];
    }


}
