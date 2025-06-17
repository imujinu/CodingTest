package com.jw.java.board.past.JuneThrid;

import java.io.*;
import java.util.StringTokenizer;

public class Minecraft {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 경우의 수
        // 1. 블록이 충분할 때
        // 블록을 깎아야 할 때
        // 블록을 추가해야 할 때

        // 2. 블록이 충분하지 않을 때
        // 블록을 깎아야 할 때

        //배열에 다 넣어놓고 값이 다를 때마다 a,b의 갯수를 구해.

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int idx = N*M;
        int[] ground = new int[idx];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
            int number = Integer.parseInt(st.nextToken());
            ground[i] = number;
            }
        }

        int max = 0;
        int min =ground[0];
        for(int num : ground){
            if(num>max) max=num;
                    else if(num<ground[0])min=num;
        }


        int sum = 0;
        for(int num : ground){

            sum+= max-num;
        }

        if(K>=sum){
           bw.write(String.valueOf(sum));
        }else{
            //블록이 부족하므로 무조건 빼야됨
        }
        bw.close();
        br.close();


    }
}
