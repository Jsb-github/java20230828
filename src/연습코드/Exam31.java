package 연습코드;

import java.util.HashSet;
import java.util.Set;

public class Exam31 {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        Set<Character> set = new HashSet<>();
        int no=0;

        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        for(String word : words) {
            boolean consistentString = true;
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    consistentString = false;
                    break;
                }
            }

            if (consistentString) {
                no++;
            }
        }



        System.out.println(set);
        System.out.println(no);


    }
}
