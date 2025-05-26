package com.jw.java.board.now;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Balance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
        Stack<String> stack = new Stack<String>();

        String str = br.readLine();
        if(String.valueOf(str.charAt(0)).equals("."))break;
        else if(str.trim().equals(".")){
            bw.write("yes" + "\n");
            break;
        }
        for(int i =0; i<str.length() ; i++){
            if(str.charAt(i) == '[' || str.charAt(i) == '(')stack.push(String.valueOf(str.charAt(i)));
        }
        boolean isTrue = true;
        for(int i =0; i<str.length() ; i++){
            if(str.charAt(i) == ']')
            {
                if (stack.isEmpty() || !stack.pop().equals("[")) {
                    isTrue = false;
                    break;
                }
            }
            else if(str.charAt(i)== ')'){
                if (stack.isEmpty() || !stack.pop().equals("(")) {
                    isTrue = false;
                    break;
                }
            }
        }
        bw.write(isTrue? "yes" +"\n" :"no"+"\n");
        }
        bw.close();
        br.close();
    }
}
