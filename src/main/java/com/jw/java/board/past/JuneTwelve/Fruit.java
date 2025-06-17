package com.jw.java.board.past.JuneTwelve;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Fruit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] fruitBox = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            fruitBox[i]=Integer.parseInt(st.nextToken());
        }
        HashMap<Integer,Integer> box = new HashMap<>();
            int left = 0;
            int length = Integer.MIN_VALUE;

        for(int i=0; i<N; i++){
            int fruit = fruitBox[i];
            box.put(fruit, box.getOrDefault(fruit,0)+1);

            while(box.size()>2){

                    int searchFruit = fruitBox[left];
                    box.put(searchFruit,box.get(searchFruit)-1);


                if (box.get(searchFruit) == 0) {
                    box.remove(searchFruit);
                }
                left++;

            }
                length = Math.max(length, i-left+1 );

        }

        bw.write(String.valueOf(length));
        bw.close();

    }
}
