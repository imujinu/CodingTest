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
        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int count =0;
        if(K==0) {
            bw.write(String.valueOf(M));
            bw.close();
            return;
        }
        Set<Integer> set = new HashSet<>();
        //진실을 아는 사람을 set에 추가
        for(int i=0; i<K; i++){
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<M; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int length = Integer.parseInt(st.nextToken());
            boolean check = false;
            for(int j=0; j<length; j++){
                int temp = Integer.parseInt(st.nextToken());
                list.get(i).add(temp);
                if(set.contains(temp)){
                    check=true;
                }
            }

        }
        boolean changed = false;
        do{
                changed = false;
            for(int i=0; i<M; i++){
                boolean tempCheck = false;
                for(int temp : list.get(i)){
                    if(set.contains(temp)){
                        tempCheck = true;

                    break;
                    }
                }

                if(tempCheck){
                    for(int temp : list.get(i)){
                        if(!set.contains(temp)){
                            set.add(temp);
                            changed=true;
                        }
                    }
                }
            }

        }while(changed);

        for(int i=0; i<M; i++){
            boolean checkTemp = false;
            for(int temp : list.get(i)){
                if(set.contains(temp)){
                    checkTemp=true;
                    break;
                }
            }
            if(!checkTemp)count++;
        }

        bw.write(String.valueOf(count));
        bw.close();




    }
}
