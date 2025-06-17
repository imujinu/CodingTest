package com.jw.java.board.past.JuneFourty;
        import java.util.*;

public class Marathon {
    public static void main(String[] participant, String[] completion)   {
        HashMap<String,Integer> parti = new HashMap<>();
        HashMap<String,Integer> comple = new HashMap<>();
        String answer = "";
        for(int i=0; i<participant.length ; i++){
            String man = participant[i];
            parti.put(man, parti.getOrDefault(parti.get(man),0)+1);
        }
        for(int i=0; i<completion.length ; i++){
            String man = completion[i];
            comple.put(man, comple.getOrDefault(comple.get(man),0)+1);
        }
        for(int i=0; i<completion.length; i++){
            String man = completion[i];
            int partiValue = parti.get(man);
            int compleValue = comple.get(man);
            if(partiValue!=compleValue)answer=man;
        }



    }
}
