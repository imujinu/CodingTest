package com.jw.java.board.June.TwentThree;

import java.io.*;
import java.util.StringTokenizer;

public class Pipe2 {
    static int N,count;
    static int[][]map;
    static int[][][]dp;
    static void dfs(int y, int x, int dir){
        if(y==N-1 && x==N-1){
            count++;
            return;
        }
        if(dir == 0 || dir ==2){

        if(x+1<N && map[y][x+1]==0){
            dfs(y,x+1,0);
        }
        }

        if(dir == 1|| dir ==2){

        if(y+1<N && map[y+1][x]==0){
            dfs(y+1,x,1);
        }

        }
        if(y+1<N && map[y+1][x]==0 && x+1<N && map[y][x+1]==0 && map[y+1][x+1]==0){
            dfs(y+1,x+1,2);
        }



    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        dp = new int[N][N][3];
        // 도달하는 방법이 세가지가 존재하기 때문에 3차원 배열끝에 명시
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }

        }
        dp[0][1][0] = 1;
        dfs(0,1,0);
        bw.write(String.valueOf(count));
        bw.close();


    }
}
