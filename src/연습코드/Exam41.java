package 연습코드;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam41 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;

        List<Boolean> b = solution1.kidsWithCandies(candies,extraCandies);
        System.out.println(b);
    }
}

class Solution1 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = Arrays.stream(candies)
                .max()
                .getAsInt();

       return Arrays.stream(candies)
                .map(c->c+extraCandies)
                .mapToObj(c->c>=max)
                .toList();


    }
}