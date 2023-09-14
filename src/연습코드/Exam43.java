package 연습코드;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exam43 {
    public static void main(String[] args) {
    int [] nums = {1,2,3,4,5};
    Solution4 solution4 = new Solution4();

    int a= solution4.sumOfUnique(nums);
        System.out.println(a);
    }
}


class Solution4 {
    public int sumOfUnique(int[] nums) {

        return   Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))

                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .map(e->e.getKey())
                .mapToInt(Integer::intValue)
                .sum();








    }
}