package com.jw.java.board.JuneThrid;

import java.io.*;
import java.util.StringTokenizer;

public class Virus {
    static boolean[][] virus ;
    static boolean[] visited;
    static int N, M, x, y, count;
    static void dfs(int x){
        count++;
        visited[x] = true;

        for(int i=0; i<=M; i++){
            if(virus[x][i] && !visited[i]){
                dfs(i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N= Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        virus = new boolean[N+1][N+1];
        visited = new boolean[N+1];

        for(int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            virus[x][y] = virus[y][x] = true;
        }

        dfs(1);

        bw.write(String.valueOf(count-1));
        bw.close();
        br.close();

    }
}
