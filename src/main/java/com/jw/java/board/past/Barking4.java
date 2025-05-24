package com.jw.java.board.past;

public class Barking4 {
    public static void main(String[] args) {
    int result1 = func4(5);
    int result2= func4(97615282);
    int result3= func4(1024);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static int func4(int num){
        int val = 1;
        while(2*val <= num) val*=2;
        return val;
    }
}
