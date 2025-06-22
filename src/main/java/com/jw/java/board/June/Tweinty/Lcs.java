package com.jw.java.board.June.Tweinty;

import java.io.*;

public class Lcs {
    static String str1;
    static String str2;
    static StringBuilder sb;
    static void dfs(int start){
        if(start==str1.length()){
            return;
        }
        char ch1 = str1.charAt(start);

        for(int i=start; i<str2.length(); i++){
            if(ch1== str2.charAt(i)){
                sb.append(ch1);
                dfs(start+1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();
        str1 = br.readLine();
        str2 = br.readLine();

        dfs(0);

        System.out.println(sb.toString().length());
    }
}
