package 연습코드;

public class Exam21 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        int answer =0;

        for(int i=0; i<numbers.length; i++){
            for (int j=i+1; j<numbers.length; j++){
                int r = numbers[i]*numbers[j];
                answer = Math.max(answer,r);
            }
        }
        System.out.println(answer);
    }
}
