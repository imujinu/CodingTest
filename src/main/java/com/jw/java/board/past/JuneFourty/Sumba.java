package com.jw.java.board.past.JuneFourty;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Sumba {
    static boolean[] visited;
    static int N, M, count;
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        loop1:
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                int num = queue.poll();
                if(num==M)break loop1;

                int[] next = {num-1, num+1, num*2};

                for(int n : next){
                    if(n>=0 && n<visited.length&& !visited[n]){
                        visited[n] = true;
                        queue.add(n);
                    }
                }

            }
            count++;


        }




    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // bfs 문제. -1, +1, x2 를 반복하면서 그 해당 경로에서 이동을 반복해 나가야함.
        // 그럼 일단 5에서 시작을 해서 4 6 10 이렇게 되는 값을 저장한다음에
        visited = new boolean[100001];
        bfs(N);

        bw.write(String.valueOf(count));
        bw.close();

    }
}
