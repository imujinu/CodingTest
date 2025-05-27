package com.jw.java.board.now;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class PS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
                Boolean isTrue = true;

            for(int j =0; j<str.length(); j++){
                char ch = str.charAt(j);
                if(ch=='(' )stack.push(ch);
                else if(ch==')'){
                    if(stack.isEmpty() || stack.pop()!='(') {
                        isTrue = false;
                    break;
                    }
                }


            }
                if(!stack.isEmpty())isTrue=false;
                bw.write(isTrue? "YES\n" : "NO\n");
        }
            bw.close();
            br.close();



    }
}
