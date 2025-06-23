package com.jw.java.board.June.TwentThree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Chicken {
    static boolean[] visited;
    static List<int[]> house;
    static int N,M, sumLength;
    static List<int[]> list;
    static List<int[]> select;
    static void dfs(int start, int depth){
        if(depth==M){
            int sum =0;
            for(int[] arr : house){
                int length = Integer.MAX_VALUE;
                for(int[] arr2 : select){
                    int chY = Math.abs(arr2[0]-arr[0]);
                    int chX = Math.abs(arr2[1]-arr[1]);
                    length = Math.min(length,chY+chX);
                }
                sum+=length;
            }
            sumLength=Math.min(sumLength,sum);
            return;
        }

        for(int i=start; i<list.size(); i++){
            if(!visited[i]){
            visited[i] = true;
            select.add(list.get(i));
            dfs(i+1, depth+1);
            select.removeLast();
            visited[i] = false;
            }
        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sumLength = Integer.MAX_VALUE;
        house = new ArrayList<>();
        select = new ArrayList<>();
        list = new ArrayList<>();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                int temp = Integer.parseInt(st.nextToken());
                if(temp==1){
                    house.add(new int[]{i,j});
                }
                if(temp==2){
                    list.add(new int[]{i,j});
                }
            }
        }
        visited = new boolean[list.size()];
        dfs(0,0);
        //치킨집을 두개씩 넘겨줘야하나. 각 치킨집에서 거리가 더 가까운 걸 치킨 거리에 더해야 하니까.

        bw.write(String.valueOf(sumLength));
        bw.close();



    }
}
