package com.jw.java.board.now;

import java.io.*;
import java.net.Inet4Address;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Array {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        HashMap<Integer, String> people = new HashMap<>();
        HashMap<String, Integer> join = new HashMap<>();
        for(int i =0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            people.put(age, name);
            join.put(name,i);
        }

        for(int i=0; i<people.size(); i++){
            if (people.)
        }

//        나이 순서가 바뀌는 경우는 나이를 비교했을 때 나이가 더 적을 경우
//        이름 순서가 바뀌는 경우 나이가 더 적을 경우 + 나이가 같다면 먼저 가입한 경우
//        그럼 여기서 먼저 가입한 경우가 언제 인지를 규정할 수 있어야해.

    }
}
