package com.jw.java.board.June.NineTeen;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class City {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N =Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        ArrayList<int[]> list = new ArrayList<>();

        for(int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());
            list.add(new int[]{num1,num2,num3});
        }

        list.sort((a,b)-> a[2]-b[2]);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int sum =0;
        for(int i=0; i<M-1; i++){
           int startTemp =  list.get(i)[0];
           int endTemp = list.get(i)[1];
           if(startTemp==start){
               for(int j=i+1; j<M; j++){
                  int temp =  list.get(j)[0];
                  int temp2 = list.get(j)[1];
                  if(endTemp==temp && end==temp2){
                      sum+=list.get(i)[2]+list.get(j)[2];
                  }
               }
           }
        }

        bw.write(String.valueOf(sum));
        bw.close();

    }
}
