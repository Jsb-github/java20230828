package 연습코드;

public class Exam16 {
    public static void main(String[] args) {
        /*
        * 배열 회전시키기
            문제 설명
            정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
            배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨
            배열을 return하도록 solution 함수를 완성해주세요.

        * */

        int[] numbers ={1,2,3};
        String direction = "right";

        int[] answer = new int[numbers.length];
        int cnt=0;
            int dr = 0;

            if(direction.equals("left")){
                dr =1;
            }else{
                dr =-1;
            }

        for(int i=0; i<numbers.length;i++){
            int target =(i+dr+numbers.length)%numbers.length;
            //left
            //0+1+3 = 4%3 = 1
            //1+1+3 = 5%3 = 2
            //2+1+3 = 6%3= 0

            //right
            //0-1+3 = 2%3 = 2
            //1-1+3 = 3%3 = 0
            //2-1+3 = 4%3 = 1
            System.out.println(target);
            answer[target] = numbers[i];

        }

    }
}
