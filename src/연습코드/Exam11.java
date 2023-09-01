package 연습코드;

import java.util.ArrayList;
import java.util.List;

public class Exam11 {
    public static void main(String[] args) {
    /*
    * 할 일 목록
문제 설명
   오늘 해야 할 일이 담긴 문자열 배열 todo_list와 각각의 일을
*  지금 마쳤는지를 나타내는 boolean 배열 finished가 매개변수로 주어질 때,
*  todo_list에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을
*  return 하는 solution 함수를 작성해 주세요.
    *
    * */


        String[] todo_list ={"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished ={true, false, true, false};
        List<String> answer = new ArrayList<>();

        for (int i=0; i<todo_list.length;i++){
            if(finished[i]!=true){
                answer.add(todo_list[i]);
            }
        }
    }
}
