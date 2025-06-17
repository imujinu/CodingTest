package com.jw.java.board.past.JuneTen;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Danji2 {
    static int N,count;
    static int[][] apart;
    static boolean[][] visited;
    public static int[] dx = {1,-1,0,0};
    public static int[] dy = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());

        apart = new int[N][N];
        visited = new boolean[N][N];

        for(int i =0; i<N; i++){
            String str = br. readLine();
            for(int j=0; j<N; j++){
                    apart[i][j]= str.charAt(j)-'0';
                    if(apart[i][j]==0){
                        visited[i][j]=true;
                    }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(apart[i][j]==1 && !visited[i][j]){
                    count=0;
                    dfs(i,j);
                    list.add(count);
                }
            }
        }

        Collections.sort(list);

        bw.write(String.valueOf(list.size())+"\n");

        for(int number: list){
            bw.write(String.valueOf(number)+"\n");
        }

        bw.close();
        br.close();


    }
    static void dfs(int y, int x){
        visited[y][x]=true;
        count++;
        for(int i =0; i<4; i++){
            int cy = dy[i]+ y;
            int cx = dx[i]+ x;

            if(cy>=0 && cx>=0 && cy<N && cx<N){
                if(apart[cy][cx]==1&&!visited[cy][cx]){

                dfs(cy,cx);
                }
            }
        }

    }
}
