package com.jw.java.board.JuneThrid;

import java.io.*;

public class Sugar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        while(true){

            if(N%5==0) {
                count += N / 5;
                break;
            }
            //5로 한번에 나눠지면 몫을 더해주고 종료
            // 여길 통과했다면 3으로만 나눠지는 경우, 3으로 나눠진 뒤 5로나눠지는 경우가 존재

            else{
                N-=3;
                count++;
            }

            //3으로만 나눠지는 경우 -3을 반복
            // 만약 그렇게 했는데 N이 음수값이 된다면 종료 후 count= -1;
            // 중간에 N이 0이 된다면 N%5==0에 의해 count에 0이 더해지고 break됨.

            if(N<0) {
                count=-1;
                break;
            }

        }
        bw.write(String.valueOf(count));
        bw.close();
        br.close();
    }
}
