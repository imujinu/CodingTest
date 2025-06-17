package com.jw.java.board.JuneSeventeen;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Alpha {
    static char[][] alpha;
    static int maxlength;
    static int N, M;
    static Set<Character> set;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static boolean result;
    static void dfs(int y, int x, int length){
        maxlength = Math.max(maxlength,length);
        set.add(alpha[y][x]);

        for(int i=0; i<4; i++){
            int cy = dy[i]+y;
            int cx = dx[i]+x;
            if(cy>=0 && cx>=0 && cy<N && cx <M){

            if(possible(cy,cx)){
                set.add(alpha[cy][cx]);
                dfs(cy,cx,length+1);
                set.remove(alpha[cy][cx]);
            }
            }


        }



    }

    static boolean possible(int y, int x){
        if(set.contains(alpha[y][x]))return false;

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        alpha= new char[N][M];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                alpha[i][j] = str.charAt(j);
            }
        }
        set = new HashSet<>();
        dfs(0,0,1);
        bw.write(String.valueOf(maxlength));
        bw.close();
    }
}
