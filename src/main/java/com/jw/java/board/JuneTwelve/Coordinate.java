package com.jw.java.board.JuneTwelve;

import java.io.*;
import java.net.Inet4Address;
import java.util.*;

public class Coordinate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        // map 안에 순서를 value값으로 넣어놓고 for문으로 가져오기
        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new LinkedHashSet<>();
        int[] value = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i =0 ;i<N; i++){
            int n = Integer.parseInt(st.nextToken());
            value[i] = n;
            set.add(n);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : set){
            list.add(n);
        }

        list.sort(Comparator.naturalOrder());

        for(int i=0; i<list.size(); i++){
            map.put(list.get(i), i);
        }

        for(int i =0; i<value.length; i++){
            int idx = map.get(value[i]);
            bw.write(String.valueOf(idx)+" ");
        }
        bw.close();

    }
}
