package 연습코드;

import java.util.HashMap;
import java.util.Map;

public class Exam33 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        // [1,3] : 1+2  [2,1] : 0 [3,2] : 1

        Map<Integer, Integer> map = new HashMap<>();
        int sum =0;

        for (int num : nums) {
            //처음이면
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int value =entry.getValue();

            int midSum = (value)*(value-1)/2;
            sum +=midSum;
        }

        System.out.println(sum);
    }
}
