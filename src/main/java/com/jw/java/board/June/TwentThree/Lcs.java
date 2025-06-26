package com.jw.java.board.June.TwentThree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Lcs {
    static String str1, str2;
    static int N,M;
    static boolean[] visited;
    static List<Character> list;
    static int dfs(int x, int y) {
        if (x == N || y == M) return 0; // 끝까지 도달

        if (str1.charAt(x) == str2.charAt(y)) {
            return 1 + dfs(x + 1, y + 1); // 같은 문자면 둘 다 한 칸 전진
        } else {
            return Math.max(dfs(x + 1, y), dfs(x, y + 1)); // 둘 다 시도
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        str1 = br.readLine();
        str2 = br.readLine();
        N = str1.length();
        M = str2.length();
        list = new ArrayList<>();
        visited= new boolean[M];
        dfs(0,0);

        bw.write(String.valueOf(list.size()));
        bw.close();
    }
}
