package 연습코드;

public class Exam18 {
    public static void main(String[] args) {
        /*
        * "aya", "yee", "u", "maa", "wyeoo"
        *
        * */

        String  [] baby = {"aya", "yee", "u", "maa", "wyeoo"};
        String [] arr = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String a:baby){
            for (String b: arr) {
               a=a.replace(b," "); // 공백
            }
            if(a.replaceAll(" ","").equals("")){
                answer++;
            }
        }
        
        
        System.out.println(answer);
    }
}
