package com.jw.java.board.June.Last;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Cheese {
    static int N,M;
    static int[][] map;
    static int[][] tempMap;
    static boolean[][] visited;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int count = 0;


        while(true){
        visited=new boolean[N][M];
        bfs(0,0);
        if(!melt())break;
        count++;
        clear();
        }
        //bfs로직으로 안에 위치한 외부 공간을 치즈로 바꿔준 다음에 안에서 백트래킹 처리?
        // 그래서 bfs가 return 되었을 때 거기서 치즈 갯수 세고 없에서 다시 리턴
        bw.write(String.valueOf(count));
        bw.close();

    }
    static void bfs(int y, int x){
        map[y][x] =2;
        visited[y][x] =true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y,x});

        while(!queue.isEmpty()){
            int[] arr = queue.poll();
            int tempY = arr[0];
            int tempX = arr[1];

            for(int i=0; i<4; i++){
                int cy = dy[i] + tempY;
                int cx = dx[i] +tempX;

                if(cy>=0 && cx>=0 && cy<N && cx<M){
                    if(!visited[cy][cx] && map[cy][cx]==0){
                        visited[cy][cx] =true;
                        map[cy][cx]=2;
                        queue.add(new int[]{cy,cx});
                    }

                }
            }
        }
    }

    static boolean melt(){
        boolean check= false;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j]==1){
                    if(meltCheck(i,j)){
                        check=true;
                        map[i][j] =0;
                    }
                }
            }
        }
        return check;
    }

    static boolean meltCheck(int y, int x){
        int count = 0;
        for(int i=0; i<4; i++){
            int cy = dy[i] + y;
            int cx = dx[i] + x;

            if(map[cy][cx]==2){
                count++;
            }
        }
        if(count>=2)return true;
        return false;
    }

    static void clear(){
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j]==2){
                    map[i][j]=0;
                }
            }
        }
    }

}
