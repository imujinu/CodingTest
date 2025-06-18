package com.jw.java.board.June.JuneEighteen;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Tetro {
    static int[][] map;
    static boolean[][] visited;
    static int N,M,max;
    static ArrayList<Integer> list;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    // ㅓ ㅏ ㅗ ㅜ 4개의 패턴 처리해주기
    static int[][] ny = {
            {0, 0, 0, -1}, // ㅗ
            {0, 0, 0, 1},  // ㅜ
            {0, -1, 1, 0}, // ㅓ
            {0, -1, 1, 0}  // ㅏ
    };

    static int[][] nx = {
            {0, -1, 1, 0}, // ㅗ
            {0, -1, 1, 0}, // ㅜ
            {0, 0, 0, -1}, // ㅓ
            {0, 0, 0, 1}   // ㅏ
    };
    static void dfs(int y, int x, int depth, int sum){

        if(depth==4){
            max=Math.max(sum,max);
            return;
        }

        visited[y][x]= true;

        for(int i=0; i<4; i++){
            int cy = dy[i]+y;
            int cx = dx[i]+x;
          if(cy>=0 && cx>=0 && cy<N && cx<M){
              if(!visited[cy][cx]){
                  dfs(cy,cx,depth+1, sum+map[cy][cx]);
              }
          }
        }

        visited[y][x]=false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                int num = Integer.parseInt(st.nextToken());
                map[i][j]=num;
            }
        }

                visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                dfs(i,j,1,map[i][j]);

                for(int k=0; k<4;k++){
                    boolean check = true;
                    int temp2=0;
                    for(int p=0; p<4; p++){
                        int dy = ny[k][p]+i;
                        int dx = nx[k][p]+j;
                        if(dy>=0 && dx>=0 && dy<N && dx<M){
                            int num = map[dy][dx];
                            temp2+=num;
                        }else{
                            check=false;
                            break;
                        }
                    }
                    if(check){
                        max = Math.max(max,temp2);
                    }

                }
            }
        }

        bw.write(String.valueOf(max));
        bw.close();

    }
}
