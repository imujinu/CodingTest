package com.jw.java.board.June.TwentyFive;

import java.io.*;
import java.util.*;

public class Traversal {
    static class Node {
        char left, right;

        Node(char left, char right) {
            this.left = left;
            this.right = right;
        }
    }

    static Map<Character, Node> tree = new HashMap<>();

    static void preorder(char root) {
        if (root == '.') return;
        System.out.print(root);             // 루트
        preorder(tree.get(root).left);      // 왼쪽
        preorder(tree.get(root).right);     // 오른쪽
    }

    static void inorder(char root) {
        if (root == '.') return;
        inorder(tree.get(root).left);       // 왼쪽
        System.out.print(root);             // 루트
        inorder(tree.get(root).right);      // 오른쪽
    }

    static void postorder(char root) {
        if (root == '.') return;
        postorder(tree.get(root).left);     // 왼쪽
        postorder(tree.get(root).right);    // 오른쪽
        System.out.print(root);             // 루트
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 트리 구성
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            char root = input[0].charAt(0);
            char left = input[1].charAt(0);
            char right = input[2].charAt(0);
            tree.put(root, new Node(left, right));
        }

        preorder('A');
        System.out.println();
        inorder('A');
        System.out.println();
        postorder('A');
        System.out.println();
    }
}
