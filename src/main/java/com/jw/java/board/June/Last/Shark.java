package com.jw.java.board.June.Last;

import java.io.*;
import java.util.*;

public class Shark {
    static int N,y,x,sum,count;
    static int[][] map;
    static int size = 2;
    static boolean[][] visited;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    static List<int[]> result;

    static List<int[]> bfs(int y, int x, int length){
        visited = new boolean[N][N];
        List<int[]> answer = new ArrayList<>();
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y,x,length});

        while(!queue.isEmpty()){
            int[] arr = queue.poll();

            for(int i=0; i<4; i++){
                int cy = dy[i] + arr[0];
                int cx = dx[i] + arr[1];

                if(cy<0 || cx<0 || cy>=N || cx>=N)continue;

                if(visited[cy][cx])continue;

                if(map[cy][cx]>size)continue;

                visited[cy][cx] = true;

                queue.add(new int[]{cy,cx,arr[2]+1});

                if(map[cy][cx]>0 && map[cy][cx]<size){
                    answer.add(new int[]{cy,cx,arr[2]+1});
                }

            }


        }

        return answer;

    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        result = new ArrayList<>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++){
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;

                if(num==9){
                    //상어 좌표 초기화
                    map[i][j] = 0;
                    y=i;
                    x=j;
                }
            }
        }

        while(true){
            result = bfs(y,x,0);

            if(result.isEmpty())break;

            result.sort((a,b)->{
                if(a[2]!=b[2])return a[2]-b[2];
                if(a[0]!=b[0])return a[0]-b[0];
                return a[1]-b[1];
            });

            //정렬 후 첫번째 값이 가장 가까운 물고기의 위치
            int[] fish = result.get(0);

            y = fish[0];
            x = fish[1];
            sum+= fish[2];
            count++;
            map[y][x] = 0;

            if(count==size){
                size++;
                count=0;
            }

        }

        bw.write(String.valueOf(sum));
        bw.close();
    }
}
