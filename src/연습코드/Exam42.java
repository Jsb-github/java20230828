package 연습코드;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exam42 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int [] nums = {1,2,3,1,1,3};
        int a  = solution3.numIdenticalPairs(nums);
        System.out.println(a);
    }
}


class Solution3 {
    public int numIdenticalPairs(int[] nums) {

        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));


       // System.out.println(map);

//        map.entrySet()
//                .stream()
//                .map(e->e.getValue())
//                .forEach(System.out::println);

        int sum = map.values()
                .stream()
                .map(n -> (n) * (n - 1) / 2)
                .mapToInt(n -> n.intValue())
                .sum();

        return sum;
    }
}