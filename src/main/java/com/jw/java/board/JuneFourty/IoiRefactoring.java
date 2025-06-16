package com.jw.java.board.JuneFourty;

import java.io.*;

public class IoiRefactoring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int count =0;
        int temp =0;
        for(int i=1; i<M-1; i++){
            if(str.charAt(i-1)=='I' && str.charAt(i)=='O' && str.charAt(i+1)=='I'){
                // "IOI" 라는 패턴이 등장하면 count를 하기 시작해.
                // 그래서 count가 N이랑 동일하면 값을 증가시키고 가장 앞에 패턴을 제외시켜줘g
                // 왜냐하면 IOIOI 이렇게 있으면 앞에 서 셈한 IOI는 빼줘야 뒤에 패턴도 계산이 되니까.
                temp++;
                if(temp==N){
                    count++;
                    temp--;
                }
                i++;
                // 그리고 이 패턴이 등장하면 무조건이 두 칸 씩 건너 뛰어. 이미 뒤에까지 계산했으니 다음칸은 안봐도됨.
            }
            else {
                temp= 0;
            }

        }
        bw.write(String.valueOf(count));
        bw.close();

    }
}
