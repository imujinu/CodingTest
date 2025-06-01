package com.jw.java.board.MayThirty;

import java.io.*;

public class DpMinRefactoring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] numbers = new int[N+1];
        numbers[1]=0;
        for(int i=2; i<=N; i++){
            numbers[i] = numbers[i-1]+1;
            //-1한 값이 최소 값일 경우
            if(i%2==0){
                numbers[i] = Math.min(numbers[i], numbers[i/2]+1);
            }
            //만약에 i가 2로 나눠 진다면, 그전 최소 경로+1과 위에서 -1한 값을 비교
            //ex) number[4] 는 결국 number[2]를 지나야한다 그렇기 때문에 number[2] +1 한 값 혹은 number[3] +1 한 값을 비교한다.
            // 이 때 number[2]와 number[3]은 각각 최소 경로로 접근했음을 상정한다.
            if(i%3==0){
                numbers[i] = Math.min(numbers[i],numbers[i/3]+1);
                //마찬가지로 3으로 나눠지는 그 이전 배열 값에 접근한다.
                // else if로 하면 오류가 나는 이유는 6의 배수는 2와 3모두로 나눠질 수 있기 떄문이다.
                // 두 개를 모두 비교해주어야 최소 값이 나온다.
            }
        }

        bw.write(String.valueOf(numbers[N]));
        bw.close();
        br.close();
    }


}
