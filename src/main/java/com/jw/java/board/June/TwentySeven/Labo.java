package com.jw.java.board.June.TwentySeven;

import java.io.*;
import java.util.*;

public class Labo {
    static int[][] map;
    static boolean[][] visited;
    static int N,M, max, count;
    static List<int[]> zeroList;
    static List<int[]> virusList;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    static void bfs(int[] arr){
        Queue<int[]> queue =new LinkedList<>();
        queue.add(new int[]{arr[0],arr[1]});

        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            int y= temp[0];
            int x =temp[1];

            for(int i=0; i<4; i++){
                int cy = dy[i]+y;
                int cx = dx[i]+x;
                if(cy>=0 && cx>=0 && cy<N && cx<M && map[cy][cx]==0 && !visited[cy][cx]){
                    visited[cy][cx]=true;
                   count++;
                    queue.add(new int[]{cy,cx});
                }
            }
        }

    }

    public static void dfs(int y,int x, int depth){
        if(depth==3){
            count=0;
            visited= new boolean[N][M];
            int temp =0;
            for(int i=0; i<virusList.size(); i++){
                bfs(virusList.get(i));
            }
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if (map[i][j]==0) temp++;
                }
            }
            int sum = temp-count;
            max = Math.max(sum,max);
            return;
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j]==0){
                    map[i][j]=1;
                    dfs(i,j,depth+1);
                    map[i][j]=0;
                }
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        zeroList = new ArrayList<>();
        virusList = new ArrayList<>();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                int temp = Integer.parseInt(st.nextToken());
                map[i][j] = temp;

                if(temp==2)
                    virusList.add(new int[]{i,j});




            }
        }

        dfs(0,0,0);

        bw.write(String.valueOf(max));
        bw.close();
    }
}
