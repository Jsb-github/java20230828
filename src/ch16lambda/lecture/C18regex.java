package ch16lambda.lecture;

public class C18regex {
    public static void main(String[] args) {
        // regular expression : 정규 표현식 (정규식, 정규식 표현)
        // 문자열의 패턴을 나타내는 기호들

        //문자
        System.out.println("x".matches("x"));
        System.out.println("a".matches("a"));
        System.out.println("a".matches("X"));

        System.out.println();

        //문자들
        System.out.println("xyz".matches("xyz"));
        System.out.println("xxx".matches("xxx"));
        System.out.println("xxx".matches("X"));

        System.out.println();

        // 수량자 : (quantifiers)
        System.out.println("xxx".matches("x{3}"));
        // {n} n개만을 찾습니다.

        // xxx 가 "x{3}" 반복하는가

        System.out.println("aaa".matches("a{1,3}}"));
        System.out.println("aa".matches("a{1,3}"));
        System.out.println("aaa".matches("a{1,3}"));
        //{n,m} 최소 n개 ,최대 m개의 경우를 찾습니다.
        System.out.println("dog".matches("do{1,3}g"));
        System.out.println("dooog".matches("do{1,3}g"));
        System.out.println("doog".matches("do{1,3}g"));

        System.out.println("dodog".matches("do{1,3}g"));

        System.out.println();

        //그룸 : ()
        System.out.println("dodog".matches("(dog){1,3}g"));
        System.out.println("dododog".matches("(dog){1,3}g"));
        System.out.println("dog".matches("(dog){1,3}g"));

        System.out.println();

        //수량 :
        System.out.println("dog".matches("do{1,}g"));
        System.out.println("doog".matches("do{1,}g"));
        System.out.println("dooog".matches("do{1,}g"));
        System.out.println("doooog".matches("do{1,}g"));
        System.out.println("dooooog".matches("do{1,}g"));

        System.out.println();

        // ? : 없거나 한번
        System.out.println("dg".matches("do?g"));
        System.out.println("dog".matches("do?g"));
        System.out.println("doog".matches("do?g"));

        System.out.println();

        //* 0번 이상
        System.out.println("dg".matches("dg*g"));
        System.out.println("dog".matches("dg*g"));
        System.out.println("doog".matches("dg*g"));
        System.out.println("dooog".matches("dg*g"));
        System.out.println("doooog".matches("dg*g"));

        System.out.println();

        // + : 1번 이상
        System.out.println("dg".matches("do+g"));
        System.out.println("dog".matches("do+g"));
        System.out.println("doog".matches("do+g"));
        System.out.println("dooog".matches("do+g"));
        System.out.println("doooog".matches("do+g"));

        System.out.println();

        //문자 분류(Character classes)
        System.out.println("dog".matches("d[0i]g]")); //true
        System.out.println("dig".matches("d[0i]g]")); //true
        System.out.println("dag".matches("d[io]g")); //false


        System.out.println("dog".matches("d[^oi]g"));//false
        System.out.println("dig".matches("d[^oi]g"));//false
        System.out.println("dag".matches("d[^oi]g"));//true

        System.out.println("dag".matches("d[a-z]]g"));
        System.out.println("dbg".matches("d[a-z]]g"));
        System.out.println("dcg".matches("d[a-z]]g"));
        System.out.println("dzg".matches("d[a-z]]g"));

        System.out.println("dag".matches("d[a-cx-z]g"));
        System.out.println("dbg".matches("d[a-cx-z]g"));
        System.out.println("dcg".matches("d[a-cx-z]g"));
        System.out.println("ddg".matches("d[a-cx-z]g"));
        System.out.println("deg".matches("d[a-cx-z]g"));
        System.out.println("dfg".matches("d[a-cx-z]g"));
        System.out.println("dxg".matches("d[a-cx-z]g"));
        System.out.println("dyg".matches("d[a-cx-z]g"));
        System.out.println("dzg".matches("d[a-cx-z]g"));

        System.out.println();

        // 문자 분류 기호
        System.out.println("0".matches("[0-9]"));
        System.out.println("7".matches("[0-9]"));
        System.out.println("0".matches("\\d"));
        System.out.println("7".matches("\\d"));

        System.out.println("a".matches("[a-zA-z_0-9]"));
        System.out.println("-".matches("\\w"));
        System.out.println("8".matches("\\w"));

        System.out.println();

        //자바 변수명 작성규칙
        //예제 :  숫자로 시작하면 안되고, 영문대소문자, _,&
        String pattern = "[a-zA-Z_$][a-zA-Z_$0-9]*";

        System.out.println("pattern_1".matches(pattern));
        System.out.println("_".matches(pattern));
        System.out.println("$".matches(pattern));
        System.out.println("1".matches(pattern));

        System.out.println();
        //전화번호 패턴
        // 010-0000-0000
        //  02 --0000-000
        //숫자 2~3로 시작 -
        String pattern2 = "[0-9]{2,3}-?[0-9]{3,4}-?[0-9]{4}";
        System.out.println("010".matches(pattern2));
        System.out.println("010-999".matches(pattern2));
        System.out.println("010999".matches(pattern2));
        System.out.println("010-0000-0000".matches(pattern2));
        System.out.println("02-9999-9999".matches(pattern2));
        System.out.println("02-999-9999".matches(pattern2));
        System.out.println("0109999999".matches(pattern2));
        System.out.println("029999999".matches(pattern2));
        System.out.println("029999999".matches(pattern2));

        System.out.println();

        //모든 문자 : .
        System.out.println(" ".matches("."));
        System.out.println("a".matches("."));
        System.out.println("3".matches("."));
        System.out.println("+".matches("."));
        System.out.println(".".matches("."));

        System.out.println();


        // . : \.
        System.out.println(" ".matches("\\.")); //false
        System.out.println("a".matches("\\."));
        System.out.println("3".matches("\\."));
        System.out.println("+".matches("\\."));
        System.out.println(".".matches("\\."));

        System.out.println();

        //이메일 패턴
        // 영문 소문자,숫자가 여러개 @ 영문 소문자,숫자 여러개 . 영문소문자,숫자 여러개
        //john23@google3.co2m

        String pattern3 = "[a-z0-9]*[@][a-z0-9]+\\.[a-z0-9]+";
        System.out.println("john23@google3.com".matches(pattern3));

        System.out.println();

        // or :
        System.out.println("auefhdogadaswqe".matches(".*dog.*"));
        System.out.println("832catlkd".matches(".*cat.*"));
        System.out.println("auefhdogsod".matches(".*(dog|cat).*"));
        System.out.println("auefhcatsod".matches(".*(dog|cat).*"));

    }
}
