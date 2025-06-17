package com.jw.java.board.JuneSeventeen;

import java.io.*;
import java.util.*;

public class Tomatio {
    static int M,N,K, day, maxDay;
    static int[][][] graph;
    static boolean[][][] visited;
    static int[] dy = {0,0,-1,1,0,0};
    static int[] dx = {0,0,0,0,-1,1};
    static int[] dz = {-1,1,0,0,0,0};
    static void bfs(List<int[]> list) {
            Queue<int[]> queue = new LinkedList<>();
            for(int[] arr : list){
                int y = arr[0];
                int x = arr[1];
                int z = arr[2];
                queue.add(new int[]{y,x,z,0});
                visited[y][x][z]=true;

            }
            while (!queue.isEmpty()){
                int[] value = queue.poll();
                int a = value[0];
                int b = value[1];
                int c = value[2];
                int day = value[3];
                maxDay = Math.max(maxDay,day);

                for(int i=0; i<6; i++){
                    int cy = dy[i]+a;
                    int cx = dx[i]+b;
                    int cz = dz[i]+c;


                if(cy>=0 && cx>=0 && cz>=0 && cy<N && cx<M && cz<K){

                if(graph[cy][cx][cz]==0 && !visited[cy][cx][cz]){
                    graph[cy][cx][cz]=1;
                    visited[cy][cx][cz]=true;
                    queue.add(new int[]{cy,cx,cz,day+1});
                }
                }


                }
            }

    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
         M = Integer.parseInt(st.nextToken());
         N = Integer.parseInt(st.nextToken());
         K = Integer.parseInt(st.nextToken());
        graph = new int[N][M][K];
        visited = new boolean[N][M][K];
        List<int[]> list = new ArrayList<>();

       for(int i=0; i<K; i++){
          for(int j=0; j<N; j++){
           st = new StringTokenizer(br.readLine());
              for(int k=0; k<M; k++){
                  int num = Integer.parseInt(st.nextToken());
                  graph[j][k][i]=num;

                  if(num==-1){
                      visited[j][k][i]=true;
                  }
                  if(num==1){
                      list.add(new int[]{j,k,i});
                  }
              }
          }
       }

       bfs(list);
       boolean check = true;
       loop1:
        for(int i=0; i<K; i++){
            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                    int num = graph[j][k][i];
                    if(num==-1 || num==0){
                        check=false;
                        break loop1;
                    }
                }
            }
        }
        if(check){
            bw.write(String.valueOf(maxDay));
        }else{
            bw.write("-1");
        }
        bw.close();


    }
}
