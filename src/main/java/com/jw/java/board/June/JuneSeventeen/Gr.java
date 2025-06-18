package com.jw.java.board.June.JuneSeventeen;

import java.io.*;

public class Gr {
    static char[][] map;
    static boolean[][] visited;
    static int N, count1,count2;
    static int[] dy ={-1,1,0,0};
    static int[] dx ={0,0,-1,1};

    static void dfs(int y, int x, char ch){
        visited[y][x] =true;

        for(int i=0; i<4; i++){
            int cy = dy[i]+y;
            int cx = dx[i]+x;

            if(cy>=0 && cx>=0 && cy<N && cx<N){
                if(map[cy][cx]==ch && !visited[cy][cx]){
                    dfs(cy,cx,ch);
                }
            }

        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];


        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j]=str.charAt(j);
            }
        }
        visited = new boolean[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j]){
                 char ch = map[i][j];
                    dfs(i,j,ch);
                    count1++;
                }
            }
        }
        visited = new boolean[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j]=='G')map[i][j]='R';
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j]){
                    char ch = map[i][j];
                    dfs(i,j,ch);
                    count2++;
                }
            }
        }
        bw.write(String.valueOf(count1)+"\n"+String.valueOf(count2));
        bw.close();
    }
}
