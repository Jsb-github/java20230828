package 연습코드;

public class Exam39 {
    public static void main(String[] args) {
        String[] order = {"americanoice", "americano", "iceamericano"};
        int answer=0;
        for(String n : order){
            if(n.contains("cafelatte")){
                answer += 5000;
            }else{
                answer +=4500;
            }
        }
        System.out.println(answer);

    }
}
