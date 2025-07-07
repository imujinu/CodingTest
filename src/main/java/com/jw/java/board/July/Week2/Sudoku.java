package com.jw.java.board.July.Week2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Sudoku {
    static int[][] map;
    static boolean[][] visited;
    static int N = 9;
    static boolean check;
    static List<int[]> list;
    static StringBuilder sb;
    static void dfs(int idx){
        if(idx==list.size()){
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    sb.append(map[i][j]);
                }
                sb.append("\n");
            }
            check = true;
            return;
        }

        for(int i=1; i<=9; i++){
            int y = list.get(idx)[0];
            int x = list.get(idx)[1];

            if(!visited[y][x] && possible(y,x,i)){
                visited[y][x] =true;
                map[y][x] = i;
                dfs(idx+1);
                if(check)return;
                map[y][x]= 0;
                visited[y][x] = false;
            }

        }
    }

    static boolean possible(int y, int x, int num){
        for(int i=0; i<N; i++){
            if(map[y][i]==num) return false;
            else if(map[i][x]==num) return false;
        }

        int tempY = 3* (y/3);
        int tempX = 3* (x/3);

        for(int i=tempY; i<tempY+3; i++){
            for(int j=tempX; j<tempX+3; j++){
                if(map[i][j]==num)return false;
            }
        }

        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        map = new int[N][N];
        visited = new boolean[N][N];
        list =  new ArrayList<>();
        sb = new StringBuilder();
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for (int j=0; j<N; j++){
                int num = str.charAt(j)-'0';
                map[i][j] =num;

                if(num==0){
                    list.add(new int[]{i,j});
                }
            }
        }

        dfs(0);
        System.out.println(sb.toString().trim());

    }
}
