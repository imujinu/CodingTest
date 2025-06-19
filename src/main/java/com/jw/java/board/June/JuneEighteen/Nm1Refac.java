package com.jw.java.board.June.JuneEighteen;

import java.io.*;
import java.util.*;
public class Nm1Refac {
    static int[] arr;
    static boolean[] visited;
    static int N,M;
    static StringBuffer sb;
    static void dfs(int depth){
        if(depth==M){
            for(int n : arr){
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<N; i++){
            if(!visited[i]){
               //visited 배열은 중복을 체크한다.
               // 자기 자신, 그리고 한번 사용된 숫자는 방문해서는 안된다.
               visited[i]=true;
               // 시작 노드를 방문했다고 명시해준다.
                arr[depth]=i+1;
                // 배열에 0번에는 시작 노드 번호, 1번 에는 나머지 번호를 넣어준다.
                dfs(depth+1);
                // 배열에 다음 값을 채우기 위해 depth+1을 재귀로 호출해준다.
                // 재귀를 사용한 이유..? 현재 값에 이어서 다음 값을 추적해야 할 때
                visited[i]=false;
                // 백트래킹 처리. 다음 노드에서 이전 시작 노드를 다시 사용할 수 있어야 함.
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new boolean[N];
        sb = new StringBuffer();
        //boolean 배열을 이용해서 visited 여부를 확인해주어야 한다
        //왜냐하면 수열에 자기 자신은 포함되면 안되기 때문에.
        dfs(0);
        System.out.println(sb);

    }
}
