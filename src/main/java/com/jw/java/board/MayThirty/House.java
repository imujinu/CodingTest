package com.jw.java.board.MayThirty;

import java.io.*;
import java.util.StringTokenizer;

public class House {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] house = new int[N][3];
        //인덱스 번호를 저장을 해놔야 돼 이전 인덱스 번호에는 접근을 하면 안되니까.
        //반복문을 돌리면서 이중배열로 값을 입력하고
        //이중배열을 만들어서 그 값과 인덱스 번호를 추가해주면 되지 않을까.

        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++){
                house[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] color = new int[N][1];

        for(int i=0; i<N; i++){
            int min=0;
            for(int j=0; j<3; j++){
                if(min<color[i][j]
            }
        }
    }
}
