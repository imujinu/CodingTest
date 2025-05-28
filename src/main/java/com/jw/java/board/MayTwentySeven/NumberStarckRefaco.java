package com.jw.java.board.MayTwentySeven;

import java.io.*;
import java.util.*;

public class NumberStarckRefaco {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int current = 1; // 다음 push할 숫자

        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());

            // 현재 target이 될 때까지 push
            while (current <= target) {
                stack.push(current++);
                sb.append("+\n");
            }

            // stack의 top이 target이면 pop
            if (stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                // 아니라면 불가능
                possible = false;
                break;
            }
        }

        System.out.println(possible ? sb.toString() : "NO");
    }
}

