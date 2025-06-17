package com.jw.java.board.past.now;

import java.io.*;
import java.util.Stack;

public class BalancdRefactoring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean isTrue = true;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        isTrue = false;
                        break;
                    }
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        isTrue = false;
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) isTrue = false;

            bw.write(isTrue ? "yes\n" : "no\n");
        }

        bw.close();
        br.close();
    }
}
