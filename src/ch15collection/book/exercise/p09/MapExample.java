package ch15collection.book.exercise.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue",96);
        map.put("hong",86);
        map.put("white",92);

        String name = null;
        int maxScore = 0;
        int max = 0;
        int totalScore =0;

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

        for (Map.Entry<String,Integer> entry : entrySet){
            totalScore +=  entry.getValue();


            if(maxScore < entry.getValue()){
                maxScore = entry.getValue();
                name = entry.getKey();
            }


        }
        System.out.println("평균 점수  : " + totalScore/entrySet.size());
        System.out.println("최고 점수  : " + maxScore);
        System.out.println("최고 점수를 받은 아이디 :  " + name);







    }
}
