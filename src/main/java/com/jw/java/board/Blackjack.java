package com.jw.java.board;

import java.io.*;
import java.util.StringTokenizer;

public class Blackjack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int card = Integer.parseInt(st.nextToken());
        int number = Integer.parseInt(st.nextToken());
        int sum =0;
         st = new StringTokenizer(br.readLine());
//       주어진 숫자들 사이에서 임의의 3개의 값을 뽑아내야 돼. 그러면 일단 배열에 값을 넣어줘야 겠지.

        int[] cards = new int[card];
        for(int i =0; i<card ; i++) cards[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i< card-2; i++){
            for(int j=i+1; j<card-1; j++){
                for(int k=j+1; k<card; k++){
                    int result = cards[i]+cards[j]+cards[k];

                    if(result<=number && sum<result)
                        sum=result;
                }
            }
        }
        bw.write(String.valueOf(sum));
        bw.close();
        br.close();

    }
}
