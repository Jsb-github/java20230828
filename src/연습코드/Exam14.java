package 연습코드;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam14 {
    public static void main(String[] args) {
        /*
        * 배열 만들기 1
            문제 설명
           정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서
        *  k의 배수를 오름차순으로 저장한 배열을 return 하는
        *  solution 함수를 완성해 주세요.
        * */

        int n = 10;
        int k = 3;
        List<Integer> answer = new ArrayList<>();

        for(int i=1; i<n; i++){
            if(i%k ==0){
                answer.add(i);
            }
        }
        for (int a :answer) {
            System.out.println(a);
        }
    }
}
