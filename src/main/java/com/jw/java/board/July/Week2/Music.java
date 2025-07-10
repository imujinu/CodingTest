package com.jw.java.board.July.Week2;

import java.io.*;
import java.util.*;

public class Music {
    static int N,M;
    static int[] singer;
    static List<List<Integer>> list;
    static List<Integer> order;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        singer = new int[N+1];
        list =new ArrayList<>();

        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int prev =0;
            for(int j=0; j<num; j++){
                int now = Integer.parseInt(st.nextToken());
                if(prev!=0){

                list.get(prev).add(now);
                singer[now]++;
                }
                    prev=now;
            }
        }

        if(topological()){
            for(int i:order){
                bw.write(String.valueOf(i)+"\n");
            }
        }else{
            bw.write("0");
        }
        bw.close();
    }

    static boolean topological(){
        Queue<Integer> queue = new LinkedList<>();
        order = new ArrayList<>();
        for(int i=1; i<=N; i++){
            if(singer[i]==0){
                queue.add(i);
            }
        }

        while(!queue.isEmpty()){
            int temp = queue.poll();
            order.add(temp);

            for(int i: list.get(temp)){
                singer[i]--;

                if(singer[i]==0){
                    queue.add(i);
                }
            }
        }

        if(order.size()==N){
            return true;
        }
        else {
            return false;
        }

    }
}
