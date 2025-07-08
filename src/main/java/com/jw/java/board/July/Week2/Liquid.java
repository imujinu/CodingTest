package com.jw.java.board.July.Week2;

import java.io.*;
import java.util.*;

public class Liquid {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int left =0;
        int right = arr.length-1;
        long min = Long.MAX_VALUE;
        long[] result = new long[3];

        while(left<right){
            long sum = 0;
            for(int i=left+1; i<right; i++){
                int temp =arr[left] + arr[i] + arr[right];
                if(Math.abs(temp)<min){
                    min = Math.abs(temp);
                    sum = temp;
                    result[0] = arr[left];
                    result[1] = arr[i];
                    result[2] = arr[right];
                }
                if(temp==0) break;
            }

            if(sum<0){
                left++;
            }else{
                right--;
            }

        }

        for(long i: result){
            bw.write(String.valueOf(i)+" ");
        }

        bw.close();
    }
}
