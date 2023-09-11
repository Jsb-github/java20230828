package 연습코드;

import java.util.HashMap;
import java.util.Map;

public class Exam32 {
    public static void main(String[] args) {
       int [] nums = {1,2,3,2};
       int sum=0;
       Map<Integer,Integer> map = new HashMap<>();

       for(int num : nums){
           if(!map.containsKey(num)) {
               map.put(num, 1);
           }else {
               int oldValue = map.get(num);
               map.put(num,oldValue+1);
           }
       }

       for (Map.Entry<Integer,Integer> entry : map.entrySet()){
           if(entry.getValue().equals(1)){
               sum += entry.getKey();
           }
       }

        System.out.println(sum);
    }
}
