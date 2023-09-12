package 연습코드;

import java.util.Date;
import java.util.Stack;

public class Exam40 {
    public static void main(String[] args) {
        String s = "ab##";
        String t = "c#d#";

        Solution solution = new Solution();
        boolean b = solution.backspaceCompare(s, t);
        System.out.println("b = " + b);
    }


}
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (char a : s.toCharArray()){
            if(a=='#'){
                if(stack1.size()>0) {
                    stack1.pop();
                }
            }else {
                stack1.push(a);

            }
        }


        for(char a : t.toCharArray()){
            if(a=='#'){
                if(stack2.size()>0) {
                    stack2.pop();
                }
            }else {
                stack2.push(a);
            }
        }


        if(stack1.size()!=stack2.size()){
            return false;
        }

        while (stack1.size()>0){
            Character char1 = stack1.pop();
            Character char2 = stack2.pop();

            if(!char1.equals(char2)) {
                return false;
            }
        }
        return true;
    }
}