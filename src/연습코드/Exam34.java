package 연습코드;

import java.util.HashMap;
import java.util.Map;

public class Exam34 {
    public static void main(String[] args) {
        //nums = [3,2,3,2,2,2]
        int [] nums = {3,2,3,2,2,2};

        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        System.out.println(map);
        boolean b1 = true;

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int value = entry.getValue();

            if(value %2 ==1 ){
                b1 = false;
            }
        }

        System.out.println(b1);


    }
}
