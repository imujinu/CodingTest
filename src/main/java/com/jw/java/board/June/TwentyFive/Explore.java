package com.jw.java.board.June.TwentyFive;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Explore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] str1 = br.readLine().toCharArray();
        char[] str2 = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=str1.length-1; i>=0 ; i--){
            char temp = str1[i];
            if(temp==str2[str2.length-1]){
                for(int j=i-1; j>=i-1-str2.length-1; j--){
                    sb.insert(0,str1[j]);
                }
            }


        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();





    }
}
