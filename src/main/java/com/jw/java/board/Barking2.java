package com.jw.java.board;

public class Barking2 {
    public static void main(String[] args) {
        int n1 = func2(new int[]{1,52,48},3);
        int n2 = func2(new int[]{50,42},2);
        int n3 = func2(new int[]{4,13,63,87},4);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }

    static public int func2(int[] arr, int N){
        for(int i =0; i<N; i++){
            for(int j=i+1; j<N ;j++){
                if(arr[i]+arr[j] == 100){
                    return 1;
                }
            }

        }
                return 0;
    }
}

