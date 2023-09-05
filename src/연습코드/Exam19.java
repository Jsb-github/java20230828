package 연습코드;

import java.util.ArrayList;

public class Exam19 {
    public static void main(String[] args) {
        int n =10;
        ArrayList<Integer> a = new ArrayList<>();

        for(int i=0; i<=n; i++){
            if(i%2!=0){
                a.add(i);
            }
        }
        System.out.println(a);
    }
}
