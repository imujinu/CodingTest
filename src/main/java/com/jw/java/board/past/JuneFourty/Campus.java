package com.jw.java.board.past.JuneFourty;

import java.io.*;
import java.util.StringTokenizer;

public class Campus {
    static int N,M,x,y;
    static char[][] school;
    static boolean[][] visited;
    static int count;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    static void dfs(int y, int x){
        visited[y][x] =true;
        if(school[y][x]=='P')count++;

        for (int i=0; i<4; i++){
            int cy = dy[i]+y;
            int cx = dx[i]+x;

            if(cy>=0 && cx >=0 && cy<N && cx<M){
                if(!visited[cy][cx]){
                    dfs(cy,cx);
                }
            }

        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N= Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());
        school = new char[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                char ch = str.charAt(j);
                school[i][j]=ch;

                if(ch=='I'){
                    y=i;
                    x=j;
                }
                else if(ch=='X'){
                    visited[i][j]=true;
                }



            }
        }

        dfs(y,x);
        if(count==0){
            bw.write("TT");
        }else{

        bw.write(String.valueOf(count));
        }
        bw.close();
    }
}
