package com.jw.java.board.JuneSeventeen;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Sudoku {
    static int[][] map;
    static boolean result;
    static int N;
    static ArrayList<int[]> coor;
    static void sort(int count){
        if(count==coor.size()){
            result = true;
            return;
        }
        int y=coor.get(count)[0];
        int x=coor.get(count)[1];

        for(int i=1; i<=N; i++){
            if(Possible(y,x,i)){
                map[y][x] = i;
                sort(count+1);
                if(result)return;
                map[y][x]=0;
            }
        }

    }

    static boolean Possible(int y,int x, int num){
        for(int i=0; i<N; i++){
            if(map[y][i]==num)return false;
        }
        for(int i=0; i<N; i++){
            if(map[i][x]==num) return false;
        }
        int dy = y/3*3;
        int dx = x/3*3;

        for(int i=dy; i<dy+3; i++){
            for(int j=dx; j<dx+3; j++){
                if(map[i][j]==num)return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = 9;
        map = new int[N][N];
        coor = new ArrayList<>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num ;
                if(num==0){
                coor.add(new int[]{i,j});
                }
            }
        }

        sort(0);

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                bw.write(String.valueOf(map[i][j])+" ");
            }
            bw.write("\n");
        }

        bw.close();



    }
}
