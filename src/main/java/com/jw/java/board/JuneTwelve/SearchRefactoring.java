package com.jw.java.board.JuneTwelve;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SearchRefactoring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] number = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            number[i]= Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Arrays.sort(number);
        for(int i=0; i<M; i++){
        int num = Integer.parseInt(st.nextToken());
            if(Arrays.binarySearch(number,num)>=0){
                bw.write("1\n");
            }else{
                bw.write("0\n");
            }
        }
        bw.close();




    }
}
