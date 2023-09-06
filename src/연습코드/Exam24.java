package 연습코드;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam24 {
    public static void main(String[] args) {
        int [] num_list = {1,2,3,4,5};
        int [] answer =  new int[2];

        int a= 0;
        int b= 0;

        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                a++;
            }else {
                b++;
            }
        }
        System.out.println(a);
    }
}
