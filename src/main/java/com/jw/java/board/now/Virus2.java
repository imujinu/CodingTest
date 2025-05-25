package com.jw.java.board.now;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Virus2 {
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;
    public static void dfs(int idx) {
        Stack<Integer> stack = new Stack<>();
        stack.push(idx);
        visited[idx] = true;

        while (!stack.isEmpty()) {
            int node = stack.pop();
            answer++;

            for (int i = N; i >= 1; i--) {
                if (!visited[i] && graph[node][i]) {
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1];
        int x, y;
        for(int i =0; i<M ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = true;
        }

        dfs(1);
        bw.write(String.valueOf(answer-1));
        bw.close();
        br.close();


    }
}
