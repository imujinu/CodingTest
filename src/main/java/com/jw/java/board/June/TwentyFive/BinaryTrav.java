package com.jw.java.board.June.TwentyFive;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryTrav {
    static Node root;
    static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        while (true){
            String value = br.readLine();

            if(value==null||value.isBlank()) break;

            list.add(Integer.parseInt(value));
        }

        root = new Node(list.get(0),null,null);

        for(int i=1; i<list.size(); i++){
            insertNode(root, list.get(i));
        }

        preOrder(root);
    }

    static void insertNode(Node root, int next){
        if(root.value<next){
            if(root.right==null){
                root.right = new Node(next,null,null);
            }else{
                insertNode(root.right, next);
            }
        }
        else{
            if(root.left==null){
                root.left = new Node(next,null,null);
            }
            else{
                insertNode(root.left,next);
            }
        }
    }
    static void preOrder(Node node){
        if(node==null)return;

        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }
}
