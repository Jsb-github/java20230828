package 연습코드;

import java.util.ArrayList;

public class Exam38 {
    public static void main(String[] args) {
        int[] num_list ={4, 2, 6, 1, 7, 6};
        int n = 2;

        int size= num_list.length;
        ArrayList<Integer> num = new ArrayList<>();

        for(int i=0; i<size; i+=n){
            num.add(num_list[i]);
        }



        for(int a : num){
            System.out.println(a);
        }

    }
}
