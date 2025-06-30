package com.jw.java.board.June.Last;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Wall {
    static int N,M;
    static int length = -1;
    static boolean[][][] visited;
    static int[][] map;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    static void bfs(int y, int x, int depth, int wall){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y,x, depth, wall});

        while(!queue.isEmpty()){
            int[] arr = queue.poll();
            int tempY = arr[0];
            int tempX = arr[1];
            int tempDepth = arr[2];
            int used = arr[3];

            if(tempY ==N-1 && tempX == M-1) {
                length=tempDepth;
                return;
            }
            for(int i=0; i<4; i++){
                int cy = dy[i] +tempY;
                int cx = dx[i] + tempX;

                if(cy>=0 && cx>=0 && cy<N && cx<M){
                    if(used==0 && map[cy][cx]==1 && !visited[cy][cx][1]){
                        //벽을 부순 적 없을 때 벽을 부순 뒤 이동
                        visited[cy][cx][1] = true;
                        queue.add(new int[]{cy,cx,tempDepth+1,1});
                    }else{
                        //벽을 부순 적 있을 때 벽을 부쉈을 때와 안부쉈을 때로 나눠서 이동
                        if(used==1 && map[cy][cx]==0 && !visited[cy][cx][1]){
                        visited[cy][cx][1] = true;
                        queue.add(new int[]{cy,cx,tempDepth+1,used});
                        }
                        else if(used==0 && map[cy][cx]==0 && !visited[cy][cx][0]){
                            visited[cy][cx][0] = true;
                            queue.add(new int[]{cy,cx,tempDepth+1,used});
                        }
                    }
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
        visited = new boolean[N][M][2];
        map = new int[N][M];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
            int num = str.charAt(j)-'0';
            map[i][j] = num;

            }
        }

           bfs(0,0,1,0);

        bw.write(String.valueOf(length));
        bw.close();

    }
}
