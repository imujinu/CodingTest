package com.jw.java.board.June.Last;

import java.io.*;
import java.util.*;

public class Jump {
    static int N =5;
    static int[][] map;
    static Set<List<Integer>> set;
    static List<Integer> result;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};

    static void dfs(int y, int x, List<Integer> result){

        if(result.size()==6){
            set.add(result);
            return;
        }

            for(int i=0; i<4; i++){
                int cy = dy[i] +y;
                int cx = dx[i] +x;

                if(cy>=0 && cx>=0 && cy<N && cx<N){
                    result.add(map[cy][cx]);
                   dfs(cy,cx,new ArrayList<>(result));
                   result.remove(result.size()-1);
                }

            }


    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        map=new int[N][N];
        set = new HashSet<>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                result= new ArrayList<>();
                result.add(map[i][j]);
                dfs(i,j, result);
            }
        }
        bw.write(String.valueOf(set.size()));
        bw.close();
    }
}
