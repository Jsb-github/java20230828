package Exam;

public class Exam4 {
    public static void main(String[] args) {
        /*n 번째 원소까지
        * 문제 설명
        정수 리스트 num_list와 정수 n이 주어질 때,
        num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은
        리스트를 return하도록 solution 함수를 완성해주세요.
        * */

        int[] num_list = {2,1,6};
        int n = 1;
        int[] answer = new int[n];

        for (int i=0; i<n; i++){
            answer[i] = num_list[i];
        }
    }
}
