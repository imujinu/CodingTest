package com.jw.java.board.JuneSixTeen;

import java.io.*;

public class Queen {
    static int N,count, temp;
    static int[] chess;
    static void dfs(int x){
        if(x == N){
            count++;
            return;
        }

        for(int i=0; i<N; i++){
        chess[x] = i;

        if(Possibility(x)){
            dfs(x+1);
        }
        }

    }
    static boolean Possibility(int col){
        for(int i=0; i<col; i++){
            if(chess[col] == chess[i]){
                return false;
            }
            else if(Math.abs(col-i) == Math.abs(chess[col]-chess[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());

        chess = new int[N];


        dfs(0);
        //한 행을 탐색하면 같은 행을 탐색할 필요가 없음
        // 다음 행에서는 대각선 위치랑 같은 열을 배제



        bw.write(String.valueOf(count));
        bw.close();
    }
}

//  ㅁ ㅋ ㅁ ㅁ
//  ㅁ ㅁ ㅁ ㅋ
//  ㅋ ㅁ ㅁ ㅁ
//  ㅁ ㅁ ㅋ ㅁ
