package 연습코드;

public class Exam23 {
    public static void main(String[] args) {
        int slice = 7;
        int n = 10;
        int an = 0;

        if(n%12==0){
            an = n/slice;
        }else{
            an = n/slice+1;
        }

        System.out.println(an);
    }
}
