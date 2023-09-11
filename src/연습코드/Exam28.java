package 연습코드;

import java.util.ArrayList;

public class Exam28 {
    public static void main(String[] args) {

        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;
        int size = candies.length;
        ArrayList<Boolean> result = new ArrayList<>();
        
        int max=0;

        for (int a:candies) {
            max = Math.max(max,a);
        }

        for(int candy : candies) {
            int tmp = candy + extraCandies;

            if(tmp >= max) result.add(true);
            else result.add(false);
        }

        System.out.println(result);


    }
}
