package com.jw.java.board.past.MayTwentySeven;

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
                //이게 왜 이렇게 되지? target이랑 peek가 같지 않다는게 다음에 들어온 수랑 지금까지의 최고값이랑 맞지 않다 이솔리잖아
                // peek의 의미가 뭐야. 내가 다음에 꺼낼 수 있는 최대 수
                // 근데 예를 들어
            } else {
                // 아니라면 불가능
                possible = false;
                break;
            }
        }

        System.out.println(possible ? sb.toString() : "NO");
    }
}

