package com.jw.java.board.JuneTen;

import java.io.*;
import java.util.*;

public class Street {
    static int N, M;
    static int[][] map;         // 원래 지형 (0, 1, 2)
    static int[][] dist;        // 결과: 거리 정보
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우 방향 벡터
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 행
        M = Integer.parseInt(st.nextToken()); // 열

        map = new int[N][M];
        dist = new int[N][M];
        visited = new boolean[N][M];

        int startX = 0, startY = 0;

        // 지도 입력 받기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                // 시작 지점 저장
                if (map[i][j] == 2) {
                    startX = i;
                    startY = j;
                }
                // 거리 배열 초기화
                dist[i][j] = -1;  // 나중에 갈 수 없는 곳은 -1로 남기기 위해
            }
        }

        // BFS 시작
        bfs(startX, startY);

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 0인 곳은 애초에 갈 수 없는 땅이므로 무조건 0 출력
                if (map[i][j] == 0) sb.append(0).append(" ");
                else sb.append(dist[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }

    // BFS 함수
    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        dist[x][y] = 0; // 시작 지점은 거리 0

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int cx = now[0];
            int cy = now[1];

            // 상하좌우 이동
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                // 범위 체크
                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

                // 이동 조건: 방문 안 했고, map 값이 1이어야만 이동 가능
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    dist[nx][ny] = dist[cx][cy] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}
