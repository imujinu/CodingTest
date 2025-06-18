package com.jw.java.board.June.JuneEighteen;

import java.io.*;
import java.util.StringTokenizer;

public class NM1 {
    static int[] arr;
    static boolean[] visited;
    static int N,M;
    static StringBuilder sb;

    static void dfs(int depth){
        //depth는 배열에 몇개의 요소를 넣었는지를 의미하므로 배열이 M과 같아지면 배열 값을 리턴.
        if(depth==M){
            for(int n : arr){
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<N; i++){
            if(!visited[i]){
                visited[i] =true;
                arr[depth] = i+1;
                //idx가 0부터 이므로 i+1부터 값을 넣어준다.
                // i==0 일때 배열크기 만큼 다음 값들을 순회하며 재귀를 시작함.
                // 자신을 제외한 모든 요소가 visited = false 이므로 값을 추가.
                dfs(depth+1);
                //depth는 탐색 깊이 && 배열의 갯수
                visited[i]=false;
                // 재귀가 끝나면 0번 노드를 false로 바꿔줌. why? 모든 수열이 가능해야함
                // 1 2 , 2 1 둘 다 가능해야 하기 때문에 백 트래킹 처리를 해준다.
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();
        arr = new int[M];
        visited = new boolean[N];

        dfs(0);
        //0번 노드부터 탐색 시작

        System.out.println(sb);
    }
}
