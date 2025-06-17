package com.jw.java.board.past.JuneThrid;

import java.io.*;
import java.util.StringTokenizer;

public class DfsBfs {
static int N,M,K,x,y;
static boolean[][] numbers;
static boolean[] visited;
static StringBuilder sb ;
    static void dfs(int x){
        visited[x] =true;
        sb.append(x + " ");

        for(int i=0; i<N+1; i++){
            numbers[x][i] =true;
            dfs(i);
        }

    }

    static void bfs(int x, int y){

    };
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

         N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        numbers = new boolean[N+1][N+1];

        for(int i =0; i<=M; i++){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            numbers[x][y]=numbers[y][x]=true;
        }

        for(int i=0; i<=N; i++){
            for(int j =0; j<=N; j++){
                if(numbers[i][j]){
                    dfs(i);
                }
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();


    }
}
