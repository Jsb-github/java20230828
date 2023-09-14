package 연습코드;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exam44 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int [] nums = {3,2,3,2,2,2};
       boolean a =  solution5.divideArray(nums);
        System.out.println(a);
    }
}
class Solution5 {
    boolean divideArray(int[] nums) {
        Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));





    return true;



    }
}