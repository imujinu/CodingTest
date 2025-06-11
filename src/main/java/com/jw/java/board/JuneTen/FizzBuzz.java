package com.jw.java.board.JuneTen;

import java.io.*;
import java.util.StringTokenizer;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        // 우리가 결국 알아야 하는 건 다음에 오는 숫자가 무엇이냐 하는 것이야.
        // 그러면 끝자리가 뭔지 알면 쉽게 구할 수 있지 않을까.
        // 어차피 fizz아니면 buzz, 그리고 fizzbuzz, 아니면 숫자. 이거 네개의 경우가 있잖아.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] str = new String[3];
        for(int i =0; i<3; i++){
            str[i] = st.nextToken();
        }
        for(String string : str){
        }


    }
}
