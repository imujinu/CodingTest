package com.jw.java.board.June.TwentThree;

import java.io.*;
import java.util.*;

public class Line {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int temp1 = Integer.parseInt(st.nextToken());
            int temp2 = Integer.parseInt(st.nextToken());
           list.add(new int[]{temp1,temp2});
        }
        list.sort((a,b)->a[0]-b[0]);

        List<int[]> result = new ArrayList<>();

        for(int[] arr :list){
            if(result.isEmpty())result.add(arr);
            else{
                int[] temp = result.get(result.size()-1);

                if(arr[0]<=temp[1]){
                    temp[1] = Math.max(arr[1],temp[1]);
                    continue;
                }
                result.add(arr);
            }


        }

        int sum =0;
        for(int[] arr : result){
            sum+= arr[1]-arr[0];
        }
        bw.write(String.valueOf(sum));
        bw.close();
    }
}
