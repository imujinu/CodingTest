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
        int[][] color = new int[N][2];

        for(int i=0; i<3; i++){
            int min = house[1][0];
            if(min>house[0][i]){
                min=house[0][i];
                color[0][0]=min;
                color[0][1]=i;
            }
        }

        for(int i=1; i<N; i++){
            int idx = house[i][1];
            int min=house[i][0];
            for(int j=0; j<3; j++){
                if(min>house[i][j] && idx!=j){
                    min= house[i][j];
                    color[i][0]=min;
                    color[i][1]=j;
                }
            }
        }

        int sum = 0;

        for(int i=0; i<N; i++){
            sum+=color[i][0];
        }

        bw.write(String.valueOf(sum));
        bw.close();
        br.close();
    }
}
