package com.jw.java.board;

import java.util.Scanner;

public class Mix2 {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                int n = scan.nextInt();
                for (int i = 1; i < n; i++) {
                    String[] s = String.valueOf(i).split("");
                    int sum=0;
                    sum+=i;
                    if(i >= 10) {
                        for (int j = 0; j < s.length; j++) {
                            sum += Integer.parseInt(s[j]);
                        }
                    }
                    if (sum == n) {
                        System.out.println(i);
                        return;
                    }



                }
                    System.out.println(0);
    }
}
