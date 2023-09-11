package 연습코드;

import java.util.HashSet;
import java.util.Set;

public class Exam30 {
    public static void main(String[] args) {
        String jewels ="aA";
        String stones = "aAAbbbb";
        int no = 0;
        Set<Character> jewelsset = new HashSet<>();

        for(char c : jewels.toCharArray()){
            jewelsset.add(c);
        }

        for(char a : stones.toCharArray()){
            if(jewelsset.contains(a)){
                no++;
            }
        }

        System.out.println(jewelsset);
        System.out.println(no);
    }

}
