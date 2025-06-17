package com.jw.java.board.past.JuneTen;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Subin {
    static int N,M,K;
    //정점이 N 으로 주어지고 M까지 도달할 때의 count 값을 구하면 돼
    // 근데 여기서 변수가 뭐냐 중간에 x2씩 이동할 수가 있어.
    // 선택을 해야돼 +1, -1 씩 이동을 할거냐 근데 이거 문자열 문제로 풀면 안풀리나?
    static boolean[][] graph;
    static boolean[][] visited;
    static int[][] dist;
    static int[] dx= {-1,1,0,0};
    static int[] dy= {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = N-M;
        graph = new boolean[K+1][K+1];
        while(true){
            if(N==M)break;
            graph[N][N+1] = true;
            graph[N+1][N] = true;
            graph[N-1][N] = true;
            graph[N][N-1] = true;
            graph[N*2][N*2] = true;
        bfs(N, N);
        }


    }
    static void bfs(int y, int x){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y,x});
        visited[y][x]=false;

        while(!queue.isEmpty()){
            int[] number = queue.poll();
            int a = number[0];
            int b = number[1];

            //2배를 먼저 곱하고. 그게 끝에 도달했는지를 검사
            // 만약 끝이 아니라면 -1이나 +1을 하고 도달할 수 있는지를 검사
            // 안된다면 다시 두배?

            for (int i=0; i<4; i++){
                int cy = a+dy[i];
                int cx = b+dx[i];

                if(cy>=0 && cx>=0 && cy<K && cx<K){


                }

            }
        }

    }
}
