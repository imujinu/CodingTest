package com.jw.java.board.June.TwentyFive;

import java.io.*;
import java.util.*;

public class Alphabet {
    static char[][] words;
    static int N,M, length;
    static Set<Character> set;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static void dfs(int y,int x, int depth){

            length=Math.max(depth,length);

            for(int i=0; i<4; i++){
                int cy = dy[i]+y;
                int cx = dx[i]+x;

                if(cy>=0 && cx>=0 && cy<N && cx<M && !set.contains(words[cy][cx])){
                    set.add(words[cy][cx]);
                    dfs(cy,cx,depth+1);
                    set.remove(words[cy][cx]);
                }
            }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        words = new char[N][M];
        set = new HashSet<>();
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                words[i][j] = str.charAt(j);
            }
        }
        set.add(words[0][0]);
        dfs(0,0,1);
        bw.write(String.valueOf(length));
        bw.close();

    }
}
