package com.jw.java.board.now;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Fashion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i =0; i<N; i++){
            int M = Integer.parseInt(br.readLine());
                HashMap<String, Integer> cloths = new HashMap<>();

            for(int j=0; j<M; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String cloth = st.nextToken();
                cloths.put(cloth, cloths.getOrDefault(cloth, 0)+1);
            }
            int answer= 1;
            for( int number : cloths.values()){
                answer*=(number+1);
               }

            bw.write(String.valueOf(answer-1)+"\n");
        }

        bw.close();
        br.close();


    }
}
