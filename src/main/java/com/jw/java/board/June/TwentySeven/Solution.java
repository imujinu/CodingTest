package com.jw.java.board.June.TwentySeven;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
        Arrays.sort(arr);

        // 정렬한 양 끝 값을 시작해서 순회를 시작. 여기서 그러면 종료조건을 뭐라고 세울거냐.
        // 왼쪽 노드가 오른쪽노드보다 idx가 커지면
        int left = 0;
        int right = arr.length-1;
        double min = Double.MAX_VALUE;
        int[] result = new int[2];

        while(left<right){
            int leftValue = arr[left];
            int rightValue = arr[right];
            double mid = Math.abs(((double) leftValue+rightValue));
           if(mid<=min){
               min = mid;
               result[0] = leftValue;
               result[1]= rightValue;

               if(Math.abs(leftValue)>Math.abs(rightValue)){
                   left++;
               }
               else{

               right--;
               }

           }
           else{

           if(Math.abs(leftValue)>Math.abs(rightValue))left++;
           else{

           right--;
           }
           }


        }

        bw.write(String.valueOf(result[0]+" " + result[1]));
        bw.close();

    }
}
