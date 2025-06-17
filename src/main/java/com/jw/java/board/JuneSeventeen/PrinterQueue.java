package com.jw.java.board.JuneSeventeen;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PrinterQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 두개의 index가 존재해야돼. 들어온 순서를 저장하는 index, 값을 저장하는 index
        // 그래서 값을 먼저 비교한다음에 큰 값이 없다면 들어온 순서대로
        int N =Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            int count=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            Queue<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                int num = Integer.parseInt(st.nextToken());
                queue.add(new int[]{num,j});
            }
                while (!queue.isEmpty()){
                    int[] arr1 = queue.poll();
                    int value1 = arr1[0];
                    int value2 = arr1[1];
                    boolean check = true;
                    for(int[] arr : queue){
                        if(value1<arr[0]){
                            check=false;
                            break;
                        }
                    }

                    if(check){
                        count++;
                        if(value2==K)break;
                    }else{
                        queue.add(arr1);
                    }

                }
                bw.write(String.valueOf(count)+"\n");
        }
        bw.close();
    }
}
