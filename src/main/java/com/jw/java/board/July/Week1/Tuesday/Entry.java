package com.jw.java.board.July.Week1.Tuesday;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Entry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long[] arr = new long[N];

        for(int i=0; i<N; i++){
            arr[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(arr);

        long left=0;
        long right = arr[arr.length-1]*M;
        long result = Long.MAX_VALUE;
        while(left<=right){
            long mid = (left+right)/2;
            long temp = 0;
            for(long i : arr){
                if(temp >= M){
                    break;
                }
                temp+= mid/i;
            }

            if(temp>=M){
                right= mid-1;
                result=Math.min(result,mid);
            }
            else{

                left=mid+1;
            }

        }
        bw.write(String.valueOf(result));
        bw.close();
    }
}
