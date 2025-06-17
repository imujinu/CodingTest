package com.jw.java.board.past.JuneFourty;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class FruitRefactoring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int left =0;
        int length = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            map.put(num , map.getOrDefault(num,0)+1);
            list.add(num);
            while (map.size()>2){
                // 탕후루의 과일이 3종류가 된 순간 과일을 제거하기 시작한다.
                int idx = list.get(left);
                map.put(idx, map.get(idx)-1);
                left++;

                if(map.get(idx)<=0){
                    map.remove(idx);
                }
            }

            length = Math.max(length, i-left+1);
            //제거 하기 전에 2종류 과일이었기 때문에 그 길이를 length에 저장
            // 만약 2종류 이상이 아니어서 제거가 안됐다면 i값이 length가 된다.
        }
        bw.write(String.valueOf(length));
        bw.close();
    }
}
