package com.jw.java.board.June.JuneEighteen;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato2 {
    static int[][][] box;
    static int M,N,K, finDay;
    static int[] dy = {0,0,-1,1,0,0};
    static int[] dx = {0,0, 0,0,-1,1};
    static int[] dz = {1,-1,0,0,0,0};
    static void bfs(){
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<K; i++){
            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                    if(box[j][k][i]==1){
                        queue.add(new int[]{j,k,i,0});
                    }
                }
            }
        }
        while (!queue.isEmpty()){
            int[] arr = queue.poll();
            int curY = arr[0];
            int curX = arr[1];
            int curZ = arr[2];
            int day = arr[3];
            finDay = Math.max(finDay,day);

            for(int i=0; i<6; i++){
                int cy = dy[i] +curY;
                int cx = dx[i] + curX;
                int cz = dz[i] + curZ;

                if(cy>=0 && cx>=0 && cz>=0 && cy<N &&cx<M && cz<K){
                    if(box[cy][cx][cz]==0){
                        box[cy][cx][cz]=1;
                        queue.add(new int[]{cy,cx,cz,day+1});
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
        K = Integer.parseInt(st.nextToken());
        box = new int[N][M][K];

        for(int i=0; i<K; i++){
            for(int j=0; j<N; j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<M; k++){
                    int num = Integer.parseInt(st.nextToken());
                    box[j][k][i] = num;
                }
            }
        }
        bfs();
        boolean check = true;
        for(int i=0; i<K; i++){
            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                    if(box[j][k][i]==0){
                        check=false;
                        break;
                    }
                }
            }
        }

        if(check){
            if(finDay==0){
                bw.write("0");
            }
            else{
                bw.write(String.valueOf(finDay));
            }
        }
        else{
            bw.write("-1");
        }
        bw.close();




    }
}
