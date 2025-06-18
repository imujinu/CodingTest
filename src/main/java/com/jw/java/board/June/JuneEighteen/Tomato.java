package com.jw.java.board.June.JuneEighteen;

import java.io.*;
import java.net.Inet4Address;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato {
    static int[][] box;
    static boolean[][] visited;
    static int N,M,finDay;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};

    static void bfs(){
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(box[i][j]==1){
                queue.add(new int[]{i,j,0});
                visited[i][j] = true;

                }
            }
        }

        while(!queue.isEmpty()){
            int[] arr = queue.poll();
            int curY = arr[0];
            int curX = arr[1];
            int day = arr[2];
            finDay = Math.max(finDay,day);

            for(int i=0; i<4; i++){
                int cy = dy[i] +curY;
                int cx = dx[i] +curX;

                if(cy>=0 && cx>=0 && cy<N && cx<M){
                    if(box[cy][cx]==0 && !visited[cy][cx]){
                        box[cy][cx]=1;
                        visited[cy][cx] = true;
                        queue.add(new int[]{cy,cx,day+1});
                    }
                }

            }

        }



    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        box = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                box[i][j]= Integer.parseInt(st.nextToken());

                if(box[i][j]==-1){
                    visited[i][j]= true;
                }
            }
        }

        bfs();

        boolean check = true;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(box[i][j]==0){
                    check=false;
                    break;
                }
            }
        }
        if(check){
        if(finDay==0){
            bw.write("0");
        }else{
            bw.write(String.valueOf(finDay));
        }
        }
        else{
            bw.write("-1");
        }
        bw.close();

    }
}
