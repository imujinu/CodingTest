package com.jw.java.board.past.now;

import java.io.*;

public class Card {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] list = new int[N];
        for(int i =0; i< N; i++){
            list[i] = i+1;
        }
//        list = [1,2,3,4,5,6,7]

        int first = 0;
        int last = N-1;

//        예를 들어 last가 6번으로 마지막에 접근하는 인덱스였다고 한다면. 증가시킨뒤 나눠줘서 다시 앞에다 넣어줘>
        while(last-first>1){
          first++;
          list[last++%N] = list[first++];
          last++;
        }

        System.out.println(list[first%N]);


    }
}
