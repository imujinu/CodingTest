package com.jw.java.board.June.TwentySeven;

import java.io.*;
import java.util.*;


public class Dust {
    static int N,M, K;
    static int[][] map;
    static int[][] tempMap;
    static List<Integer> air;
    static List<int[]> dustyAir;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};


    static void spread(List<int[]> dusty){
        Queue<List<int[]>> queue = new LinkedList<>();
        queue.add(dusty);

        while(!queue.isEmpty()){
            List<int[]> list = queue.poll();
            for(int i=0; i<list.size(); i++){
                int y = list.get(i)[0];
                int x = list.get(i)[1];

                    int count =0;
                int amount = map[y][x] / 5;
                for(int j=0; j<4; j++){
                    int cy = dy[j] +y;
                    int cx = dx[j] +x;
                    if(cy>=0 && cx>=0 && cy<N && cx<M && map[cy][cx]!=-1){
                        tempMap[cy][cx]+=amount;
                        count++;
                    }
                    //미세먼지 확산 후 원래 미세먼지 값 --
                }
                    tempMap[y][x] = tempMap[y][x]- (count * amount);
            }
        }
    }

    static void spreadUp(){
        int up = air.get(0);

        //왼쪽 끝 라인
        for(int i=up-1; i>0; i--){
            tempMap[i][0]=tempMap[i-1][0];
        }
        //맨 윗 라인

        for(int j=0; j<M-1 ; j++){
            tempMap[0][j] = tempMap[0][j+1];
        }
        // 맨 오른쪽 라인
        for(int i=0; i<up ; i++){
            tempMap[i][M-1] = tempMap[i+1][M-1];
        }
        //나머지 라인->

        for(int i=M-1; i>1; i--){
            tempMap[up][i] = tempMap[up][i-1];
        }

        tempMap[up][0] = -1;

    }

    static void spreadDown(){
        int down = air.get(1);

        //왼쪽 끝 라인
        for(int j= down+1; j<N-1; j++){
            tempMap[j][0] = tempMap[j+1][0];
        }

        // 맨 아랫 라인
        for(int i=0; i<M-1; i++){
            tempMap[N-1][i] = tempMap[N-1][i+1];
        }

        //오른쪽 라인
        for(int j=N-1; j>down; j--){
            tempMap[j][M-1] = tempMap[j-1][M-1];
        }

        //공기청정기 라인
        for(int i=M-1; i>1; i--){
            tempMap[down][i] = tempMap[down][i-1];
        }


        tempMap[down][0] = -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        air = new ArrayList<>();
        dustyAir = new ArrayList<>();
        map = new int[N][M];
        tempMap = new int[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
                if(num==-1)air.add(i);
                if(num!=-1 && num!=0){
                    dustyAir.add(new int[]{i,j});
                }

            }
        }

        for(int i=0; i<K; i++){
            tempMap = new int[N][M];
            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                    tempMap[j][k] = map[j][k];
                }
            }
            spread(dustyAir);
            spreadUp();
            spreadDown();
            tempMap[air.get(0)][1] = 0;
            tempMap[air.get(1)][1] = 0;
            dustyAir.clear();
            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                    if(tempMap[j][k]!=-1 && tempMap[j][k]!= 0){
                        dustyAir.add(new int[]{j,k});
                    }
                }
            }

            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                   map[j][k] = tempMap[j][k];
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] > 0) sum += map[i][j];
            }
        }

        bw.write(String.valueOf(sum));
        bw.close();



    }
}
