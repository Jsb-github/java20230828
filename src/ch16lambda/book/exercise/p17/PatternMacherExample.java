package ch16lambda.book.exercise.p17;


import java.util.regex.Pattern;

public class PatternMacherExample {
    public static void main(String[] args) {
        String id = "Angel1004";
        String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
//        boolean isMatch = Pattern.matches(regExp,id);
        boolean isMatch = id.matches(regExp);

        if (isMatch) {
            System.out.println("id로 사용할수 있습니다");
        } else {
            {
                System.out.println("id로 사용할수 없습니다");
            }
        }
    }
}
