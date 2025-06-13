package com.jw.java.board.JuneTwelve;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class FruitRefactioring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] fruit = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            fruit[i] = Integer.parseInt(st.nextToken());

        }
        HashMap<Integer,Integer> box = new HashMap<>();
        int left =0;
        int length = 0;
        for(int i=0; i<N; i++){
        int fruitValue = fruit[i];
        box.put(fruitValue, box.getOrDefault(fruitValue,0)+1);

        while(box.size()>2){
            int minus = fruit[left];
        box.put(minus, box.get(minus)-1);

        if(box.get(minus)==0){
            box.remove(minus);
        }
         left++;
        }
        length = Math.max(length, i-left+1);

        }
        bw.write(String.valueOf(length));
        bw.close();
    }
}
