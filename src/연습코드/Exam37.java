package 연습코드;

public class Exam37 {
    public static void main(String[] args) {
        int[] num_list ={12, 4, 15, 46, 38, -2, 15};
        int answer = 0;

        for(int i=0; i<num_list.length; i++){
            if(num_list[i] <0){
                answer = i;
                break;
            }else{
                answer = -1;
            }
        }
        System.out.println(answer);
    }
}
