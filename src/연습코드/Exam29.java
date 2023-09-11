package 연습코드;

import java.util.HashSet;
import java.util.Set;

public class Exam29 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        Set<Integer> set = new HashSet<>();
        int no = 0;
        for (int num : nums) {
            if (set.contains(num)) {
               no = num;
            }
            set.add(num);
        }

        System.out.println(set);
        System.out.println(no);
    }
}



