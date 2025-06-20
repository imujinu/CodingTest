package com.jw.java.board.June.Tweinty;

import java.io.*;
import java.util.*;

public class City1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()); // 시작 노드부터 떨어진 거리
        int X = Integer.parseInt(st.nextToken()); // 시작 노드
        StringBuilder sb = new StringBuilder();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0; i<N+1; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            list.get(n).add(m);
            //각 노드의 연결 정보를 입력한다.
        }

        int[] distance = new int[N+1];
        Arrays.fill(distance,-1);
        distance[X] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(X);

        while(!queue.isEmpty()){
            int currentInt = queue.poll();

            for(int n : list.get(currentInt)){
                if(distance[n]==-1){
                 // 아직 특정 노드까지의 거리가 초기화되지 않았을 떄
                distance[n] = distance[currentInt]+1;
                //이전 노드에서 거리를 +1 시킨다.
                queue.add(n);
                }
            }
        }

        boolean isCheck = false;
        for(int i=1; i<N+1; i++){
            if(distance[i]==K){
                isCheck=true;
                sb.append(i).append(" ");
            }
        }

        System.out.println(isCheck? sb.toString().trim() : -1);






    }
}
