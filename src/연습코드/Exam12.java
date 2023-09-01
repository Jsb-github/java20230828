package 연습코드;

public class Exam12 {
    public static void main(String[] args) {
        /*
        * 카운트 다운
        문제 설명
        정수 start_num와 end_num가 주어질 때,
        * start_num에서 end_num까지 1씩 감소하는 수들을 차례로
        * 담은 리스트를 return하도록 solution 함수를 완성해주세요.
        * */

        int start =10;
        int end_num = 3;

        int [] answer = new int[start-end_num+1];
        int cnt =0;
        for (int i=start; i>=end_num; i--){
            answer[cnt] = i;
            cnt++;
        }



//        List<Integer>  answer = new ArrayList<>();
//
//        for (int i=start; i>=end_num; i--){
//            answer.add(i);
//        }
    }
}
