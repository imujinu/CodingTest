package com.jw.java.board.now;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Array {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int[] age = new int[a];
        String[] name = new String[a];
            for(int i=0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            age[i]=Integer.parseInt(st.nextToken());
            name[i]=st.nextToken();
        }

        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){



            }
        }

//        나이 순서가 바뀌는 경우는 나이를 비교했을 때 나이가 더 적을 경우
//        이름 순서가 바뀌는 경우 나이가 더 적을 경우 + 나이가 같다면 먼저 가입한 경우
//        그럼 여기서 먼저 가입한 경우가 언제 인지를 규정할 수 있어야해.

    }
}
