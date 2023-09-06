package 연습코드;

public class Exam26 {
    public static void main(String[] args) {
        int [] array = {1,1,2,3,4,5};
        int n = 1;
        int answer = 0;

        for(int i=0; i<array.length;i++){
            if(n==array[i]){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
