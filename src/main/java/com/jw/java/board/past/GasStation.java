package com.jw.java.board.past;
import java.util.*;
import java.io.*;

public class GasStation {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        int city = Integer.parseInt(br.readLine());
        int distance = 0;
        int money = 0;
        List<Integer> cityDistance = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for( int i = 0; i<city-1 ; i++){
            cityDistance.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br. readLine());
        List <Integer> cityPrice = new ArrayList<>();
        for( int i =0; i<city ; i++){
            cityPrice.add(Integer.parseInt(st.nextToken()));
            if(cityPrice.get(1) > cityPrice.get(2)){
                money+= cityDistance.get(i+1) * cityPrice.get(i+2);
            }
            else if(cityPrice.get(1) < cityPrice.get(2)){
                money+= cityDistance.get(i+1) * cityPrice.get(i+1);
            }
        }


    }
}
