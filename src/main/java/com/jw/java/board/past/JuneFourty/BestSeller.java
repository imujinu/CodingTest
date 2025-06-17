package com.jw.java.board.past.JuneFourty;

import java.io.*;
import java.util.HashMap;

public class BestSeller {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            String book = br.readLine();
            map.put(book, map.getOrDefault(book,0)+1);
        }
        int max = Integer.MIN_VALUE;
        String maxBook = "";

        for(String book : map.keySet()){
            int num = map.get(book);
            String name = book;
            if(max<num){
            max = num ;
            maxBook = name;
            }
            else if(max ==num){
                int idx = book.compareTo(maxBook);

                if(idx<0)maxBook=book;
            }

        }
        bw.write(maxBook);
        bw.close();




    }
}
