package ch12api.lecture;

public class C13substring {
    public static void main(String[] args) {
        // substring : 부분 문자열 추출
        String a = "spring";

        String b = a.substring(0,2);
        System.out.println(b);
        System.out.println(a.substring(0,2));

        String sub2 = a.substring(2,5); //rin
        System.out.println(sub2);
        a.length();
        System.out.println(a.substring(2,6));

        System.out.println(a.substring(2)); //ring
        System.out.println(a.substring(0)); //spring

    }
}
