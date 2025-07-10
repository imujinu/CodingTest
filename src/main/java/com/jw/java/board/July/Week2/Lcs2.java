package com.jw.java.board.July.Week2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Lcs2 {
    static String str1,str2;
    static Integer[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        str1 = br.readLine();
        str2 = br.readLine();
        dp = new Integer[str1.length()][str2.length()];
       int max = traversal(str1.length()-1,str2.length()-1);
       bw.write(String.valueOf(max)+"\n");
       if(max==0){
           bw.close();
       }else{
           int y = str1.length()-1;
           int x = str2.length()-1;
           Stack<Character> stack = new Stack<>();
           while(y>=0 && x>=0){
               if(str1.charAt(y)==str2.charAt(x)){
                   stack.push(str1.charAt(y));
                   y--;
                   x--;
               }else{
                   if(x>0 && (y==0 || dp[y][x-1]>=dp[y-1][x] )){
                       x--;
                   }else{
                       y--;
                   }
               }
           }
           while(!stack.isEmpty()){
               bw.write(stack.pop());
           }

           bw.close();
       }



    };
    static int traversal(int y, int x){
        if(x<0 || y<0)return 0;

        if(dp[y][x]==null){
            dp[y][x]=0;

            if(str1.charAt(y)==str2.charAt(x)){
                dp[y][x] = traversal(y-1,x-1)+1;
            }else{
                dp[y][x] = Math.max(traversal(y-1,x), traversal(y,x-1));
            }

        }
        return dp[y][x];
    }
}
