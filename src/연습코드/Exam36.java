package 연습코드;

import java.util.ArrayList;

public class Exam36 {
    public static void main(String[] args) {

        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        ArrayList<String> answer = new ArrayList<>();

        for(int i=0;i<names.length; i++){
            if(i==0 || i%5==0){
             answer.add(names[i]);
            }
        }
        String[] array = answer.toArray(new String[answer.size()]);

        for(String n : array){
            System.out.println(n);
        }

    }
}
