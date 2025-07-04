package com.jw.java.board.July.Week1.Friday;

import java.io.*;
import java.util.*;

public class Sudoku2 {
    static int[][] map;
    static boolean[][] visited;
    static int N = 9;
    static List<int[]> list = new ArrayList<>();
    static StringBuilder sb;
    static boolean end;
    static void dfs(int idx){
        if(idx==list.size()){
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    sb.append(map[i][j]).append(" ");
                }
                sb.append("\n");
            }
            end= true;
            return;
        }

        int y = list.get(idx)[0];
        int x = list.get(idx)[1];

        for(int i=1; i<=9; i++){

               if(check(y,x,i)){
                    map[y][x] = i;
                    dfs(idx+1);
                    if(end)return;
                    map[y][x]= 0;
               }


        }


    }
    static boolean check(int y, int x, int temp){
        for(int i=0; i<9; i++){
           if(map[y][i]==temp)return false;
           if(map[i][x]==temp)return false;
        }
        int tempY = 3* (y/3); // 0 1 2  0 4 7 5 /3 1+3 4 7 /3 2 +3 2 6
        int tempX = 3* (x/3);

        for(int i=tempY; i<tempY+3; i++){
            for(int j=tempX; j<tempX+3; j++){
                if(map[i][j]==temp)return false;
            }
        }

        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();
        map = new int[N][N];
        for(int i=0; i<N; i++){
            StringTokenizer st  =new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
                if(num==0){
                    list.add(new int[]{i,j});
                }
            }
        }

      dfs(0);


        System.out.println(sb.toString().trim());
    }
}
