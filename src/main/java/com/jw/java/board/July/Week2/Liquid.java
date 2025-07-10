package com.jw.java.board.July.Week2;

import java.io.*;
import java.util.*;

public class Liquid {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        long [] result = new long[3];
        long temp = Long.MAX_VALUE;
        for(int i=0; i<N-2; i++){
            int left = i+1;
            int right = arr.length-1;

            while(left<right){
            long mid = arr[i] + arr[left] + arr[right];
                if(temp>Math.abs(mid)){
                    temp = Math.abs(mid);
                    result[0] =arr[i];
                    result[1] =arr[left];
                    result[2] = arr[right];
                }

                if(mid==0)break;

               if(mid>0){
                   right--;
               }else{
                   left++;
               }


            }
        }

            Arrays.sort(result);
            for(long i : result){
                bw.write(String.valueOf(i)+" ");
            }
            bw.close();
    }
}
