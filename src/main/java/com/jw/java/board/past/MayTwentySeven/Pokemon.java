package com.jw.java.board.past.MayTwentySeven;


import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Pokemon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> StringDictionary = new HashMap<>();
        HashMap<Integer,String> IntegerDictionary = new HashMap<>();

        for(int i =1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            StringDictionary.put(name,i);
            IntegerDictionary.put(i,name);
        }

        for(int i =0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            String value = st.nextToken();
           Boolean isNum = isNumber(value);
           if(isNum){
               String name = IntegerDictionary.get(Integer.parseInt(value));
               bw.write(name+"\n");
           }else{
               String idx = String.valueOf(StringDictionary.get(value));
               bw.write(idx+"\n");
           }

        }
        bw.close();
        br.close();
    }
    public static boolean isNumber(String string){
        try{
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
