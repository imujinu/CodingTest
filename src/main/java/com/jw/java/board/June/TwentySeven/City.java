package com.jw.java.board.June.TwentySeven;

import java.io.*;
import java.util.*;

public class City {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<int[]> list = new ArrayList<>();

        for (int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int temp1 = Integer.parseInt(st.nextToken());
            int temp2 = Integer.parseInt(st.nextToken());
            list.add(new int[]{temp1,temp2});
        }

        //Q1. Arrays.sort와 Collections.sort의 차이점은 무엇인가.
        Collections.sort(list, (a,b)->{
            if((b[1]/b[0])==(a[1]/a[0])){
                return b[1] -a[1];
            }else{

            return (b[1]/b[0]) - (a[1]/a[0]);
            }
        });
        int[] tempArr = list.get(0);
        int sum = (tempArr[0] * (N/tempArr[1]));
        N = N%tempArr[1];
        if(N==0) {
            bw.write(String.valueOf(sum));
            bw.close();
        }else{

        int min = Integer.MAX_VALUE;
        int minIdx = 0;
        if(N!=0){
            for(int i=0; i<list.size(); i++){
                int tempN = N;
                int count =0;
                while(tempN >0){
                    tempN -= list.get(i)[1];
                    count+=list.get(i)[0];
                }
                if(min>count){
                    min = count;
                    minIdx = i;
                }
            }

        }

        sum += min * list.get(minIdx)[0];
        bw.write(String.valueOf(sum));
        bw.close();
        }
    }
}
