package com.jw.java.board.past.MayThirty;

import java.io.*;

public class Min {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        //2랑 3으로 나누라고 한 이유?
        // 어떤 수든
        //2 -1 || /2
        //3 /3
        //4 /2 -1
        //5 -- /2 --
        //6 /3 --
        //7 -- /3 --
        //8 -- -- 2 -- 4번 || 4 2 --
        //숫자가 아무리 커져도 결국 2랑 3으로 귀결된다.
        while(true){
            if(N%3==0){
                N/=3;
                count++;
            }
            //경우 1. 3으로 나눠떨어지면 3으로만 나누면 최솟값
            else if(N%3==1){
                N--;
                count++;
            }
            else if(N%3==2){
                N/=2;
                count++;
            }
            if(N==1)break;
        }

        bw.write(String.valueOf(count));
        bw.close();
        br.close();
    }
}
