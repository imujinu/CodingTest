package com.jw.java.board.June.TwentyFive;

import java.io.*;

import java.util.Stack;

public class Explore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = br.readLine();
        String str2 = br.readLine();
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str1.length(); i++){
            stack.push(str1.charAt(i));

            if(stack.size()>=str2.length()){
                // 스택에 크기가 str2보다 커질때마다 검사 수행
                boolean check = true;
                for(int j=0; j<str2.length(); j++){
                    if(stack.get(stack.size()-str2.length()+j)!=str2.charAt(j)){
                        check=false;
                        break;
                    }
                }

                if(check){
                    for(int j=0; j<str2.length(); j++){
                        stack.pop();
                    }
                }

            }
        }
        if(stack.isEmpty()){
            bw.write("FRULA");
        }else{
            for(char ch : stack){
                bw.write(ch);
            }
        }
        bw.close();






    }
}
