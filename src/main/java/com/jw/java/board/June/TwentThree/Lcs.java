package com.jw.java.board.June.TwentThree;

import java.io.*;
import java.util.List;

public class Lcs {
    static String str1, str2;
    static int N,M;
    static boolean[] visited;
    static List<Character> list;
    static void dfs(int x, int y, int depth){
        if(y>M)return;
        char ch = str1.charAt(x);

        for(int i=y; i<M; i++){
            if(!visited[i] && ch==str2.charAt(i)){
                visited[i] = true;
                list.add(ch);
                dfs(x+1,y+1,depth+1);
             }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        str1 = br.readLine();
        str2 = br.readLine();
        N = str1.length();
        M = str2.length();
        visited= new boolean[M];
        dfs(0,0,0);

        bw.write(String.valueOf(list.size()));
        bw.close();
    }
}
