package com.jw.java.board;

public class Barking3 {
    public static void main(String[] args) {
    int num1 = func3(9);
    int num2 = func3(693953651);
    int num3 = func3(756580036);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
    public static int func3(int num){
        Double number = Math.sqrt(num);
        if(number%1 == 0){
            return 1;
        }
        return 0;
    }
}
