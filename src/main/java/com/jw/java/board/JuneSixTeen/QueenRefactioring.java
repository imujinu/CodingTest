package com.jw.java.board.JuneSixTeen;

import java.io.*;

public class QueenRefactioring {
    static int N,count;
    static int[] chess;
    static void nQueen(int depth ){
        if(depth==N){
            count++;
            return;
        }

        for(int i=0; i<N; i++){
            chess[depth] = i;
            //row 행에 i열에 퀸을 둔다.
            // 0행에 0~N열까지 queen을 둔 다음에 검사 한다.
            if(Possible(depth)){
                nQueen(depth+1);
            }
        }

    }

    static boolean Possible(int col){
        for(int i=0; i<col; i++){
            if(chess[i]==chess[col])return false;
            //col 이전 행까지 같은 열에 놓였던 값이 있는지 검사

        if(Math.abs(col-i)==Math.abs(chess[col]-chess[i]))return false;

        // 대각선 상에 값이 존재하면 false return


        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        chess = new int[N];

        nQueen(0);

        bw.write(String.valueOf(count));
        bw.close();
    }
}
