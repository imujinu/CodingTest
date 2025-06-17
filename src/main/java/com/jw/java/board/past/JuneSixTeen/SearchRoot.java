package com.jw.java.board.past.JuneSixTeen;

import java.io.*;
import java.util.StringTokenizer;

public class SearchRoot {
    static int[][] map;
    static boolean[] visited;
    static boolean[][] result;
    static int N;


    static void dfs(int y, int x){

        for(int i=0; i<N; i++){
            if(map[x][i]==1 && !visited[i]){
                visited[i]=true;
                result[y][i]=true;
                dfs(y, i);
            }



        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        result = new boolean[N][N];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                int num = Integer.parseInt(st.nextToken());
                map[i][j]=num;
            }
        }

        for(int i=0; i<N; i++){
            visited= new boolean[N];
            dfs(i,i);
        }

        for(int i=0; i<result.length; i++){
            for (int j=0; j<result[0].length; j++){
                String num =result[i][j]? "1" : "0";
                bw.write(num+ " ");
            }
            bw.write("\n");
        }
        bw.close();

    }
}
