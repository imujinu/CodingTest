package com.jw.java.board.now;

import java.io.*;
import java.util.Stack;

public class BalancdRefactoring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true){
            Stack<Character> stack = new Stack<>();
        String str = br.readLine();


        Boolean isTrue = true;
        if((String.valueOf(str.charAt(0)).equals(".")))break;
        if(str.trim().equals(".")) bw.write("yes"+ "\n");

        for(int i =0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(ch =='[' || ch=='('){
            stack.push(ch);
        }else if( ch==')'){
            if(stack.isEmpty() || !stack.pop().equals('('))
            isTrue=false;
            break;
        }else if(ch==']'){
            if(stack.isEmpty() || !stack.pop().equals('['))
                isTrue=false;
            break;
        }

        }
        if(!stack.isEmpty()){
            isTrue=false;
        }
        bw.write(isTrue? "yes\n" : "no\n");
        }
        bw.close();
        br.close();
    }
}
