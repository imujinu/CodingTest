package com.jw.java.board.past;

import java.io.*;
import java.util.StringTokenizer;

public class Weight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

//      2개의 정보가 각각 5번씩 주어져. 두 개의 값을 판단해서 여부를 결정지어야해.
//      두 정보를 묶고 크기에 맞게 인덱스를 바꿔주어야 한다고 생각했지만 그럴 필요 없이 반복문으로 한번씩 다 비교를 해주면 되겠네
        int range = Integer.parseInt(br.readLine());
        int[] weight = new int[range];
        int[] height = new int[range];

        for (int i =0; i<range; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }
//        값을 비교해서 저장할 공간이 외부에 필요할 것 같은데? 근데 그게 몇번째 값인지 어떻게 알지
//        지금 막힌
        int[] ranking = new int[range];
        for(int i =0; i<range; i++){
        int rank = 1;
            for(int j=0; j<range; j++){
                if(weight[i]<weight[j] && height[i]<height[j]){
                    rank++;
                }
                if(weight[i]==weight[j]&& height[i]==weight[j])break;
            }
            bw.write(String.valueOf(rank)+"\n");
        }
        bw.close();
        br.close();

    }
}
