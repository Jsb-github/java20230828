package ch15collection.lecture;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class C13map {
    public static void main(String[] args) {
        //map 전체 탐색
        Map<String,String> map = new HashMap<>();
        // 항상된 for
        Set<Map.Entry<String, String>> entries = map.entrySet();
        map.put("학생1","흥민");
        map.put("학생2","강인");
        map.put("학생3","민재");

        System.out.println("항상된 for로 전체탐색");
        for(Map.Entry<String,String> entry : entries){
            System.out.println("entry.getKey : " +entry.getKey());
            System.out.println("entry.getValue : " +entry.getValue());
        }
//        Set<String> set = new HashSet<>();
//        for(String item : set){}
        //keySet
        System.out.println("KeySet사용해서 전체 탐색 : ");
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + ":" + map.get(key));
        }

        //forEach
        System.out.println("forEach 메소드로 전체 탐색");
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+ ":" + value);
            }
        });

        map.forEach((key,value) ->System.out.println(key+ ":" + value));
    }
}
