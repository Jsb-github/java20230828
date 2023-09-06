package 연습코드;

import java.util.Arrays;

public class Exam20 {
    public static void main(String[] args) {
        int[] numbers = {0, 31, 24, 10, 1, 9};
        int answer = 0;

        Arrays.sort(numbers);

        int left = numbers[0] * numbers[1];
        int right = numbers[numbers.length-1]*numbers[numbers.length-2];
        answer =  Math.max(left,right);
        System.out.println(answer);

    }

}
