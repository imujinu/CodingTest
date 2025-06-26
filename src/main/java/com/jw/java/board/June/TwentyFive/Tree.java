package com.jw.java.board.June.TwentyFive;

import java.io.*;
import java.util.StringTokenizer;

public class Tree {
    static Node root = new Node('A',null,null);

    static class Node{
        char value;
        Node left;
        Node right;

        public Node(char value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            char now = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            insertNode(root,now,left,right);
        }
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }

    public static void insertNode(Node root, char now, char left, char right){
        if(root.value==now){
            root.left = left=='.' ? null : new Node(left,null,null);
            root.right = right=='.'? null : new Node(right,null, null);
        }else{
            if(root.left!=null){
                insertNode(root.left, now, left, right);
            }
            if(root.right!= null){
                insertNode(root.right,now,left,right);
            }
        }
    }

    static void preOrder(Node node){
        if(node==null)return;

        System.out.print(node.value);
        preOrder(node.left);
        preOrder(node.right);
    } static void inOrder(Node node){
        if(node==null)return;

        inOrder(node.left);
        System.out.print(node.value);
        inOrder(node.right);
    } static void postOrder(Node node){
        if(node==null)return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value);
    }


}
