package com.jw.java.board.June.TwentThree;

import java.io.*;
import java.util.*;

public class Lier {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<List<Integer>> parti = new ArrayList<>();
        int count =0;
        Set<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> map = new HashMap<>();
        if(K!=0){
            for(int i=0; i<K; i++){
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
            }
        }
        else{
            bw.write(String.valueOf(M));
            bw.close();
            return;
        }
        for(int i=0; i<M; i++){
            parti.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int length = Integer.parseInt(st.nextToken());

               boolean check = true;
            for(int j=0; j<length; j++){
               int temp = Integer.parseInt(st.nextToken());
               if(set.contains(temp)) {
                    set.add(temp);
               }
               parti.get(i).add(temp);
            }
        }
        for(int i=0; i<parti.size(); i++){
            List<Integer> tempList = parti.get(i);
            boolean check = true;
            for(int j : tempList){
                if(set.contains(j)){

                check=false;
                break;
                }
            }
            if(check)count++;
        }
        bw.write(String.valueOf(count));
        bw.close();

    }
}
