package com.jw.java.board.past.JuneTwelve;

import java.io.*;
import java.util.*;

public class PqRefactoring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        for(int i =0; i<length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            Queue<int[]> queue = new LinkedList<>();


                int count =0;
                st = new StringTokenizer(br.readLine());
            for(int j =0; j<N; j++){
                int num = Integer.parseInt(st.nextToken());
                queue.add(new int[]{j,num});}

                while (!queue.isEmpty()){
                    int[] temp = queue.poll();
                    boolean check = true;
                    for(int[] a : queue){
                        if(temp[1]<a[1]){
                            check=false;
                            break;
                        }
                    }

                    if(check){
                        count++;
                        if(temp[0]==M)break;
                    }else{
                        queue.add(temp);
                    }

                }

                bw.write(String.valueOf(count)+"\n");
        }
            bw.close();
            br.close();


    }
}
