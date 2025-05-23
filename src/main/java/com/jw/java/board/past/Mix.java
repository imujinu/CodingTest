package com.jw.java.board.past;

import java.io.*;

public class Mix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

//        a까지 순회를 하면서 i들을 조합해서 a를 만들어. a가 만들어지면 break
        int idx = 0;
        for(int i=0; i<a; i++){
            int number = i;
            int sum = 0;

            while (number>0){
            sum+=number%10;
            number/=10;
            }

            if(i+sum==a)
//            number+sum이
            {
                idx=i;
                break;
            };
        }
        bw.write(String.valueOf(idx));
        bw.close();
        br.close();

    }
}
