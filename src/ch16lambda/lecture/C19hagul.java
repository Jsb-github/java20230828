package ch16lambda.lecture;

public class C19hagul {
    public static void main(String[] args) {
        // 유니코드
        char a = '\u0d05';
        System.out.println(a);
        System.out.println('\u0041');
        System.out.println('\uac00');
        System.out.println('\ud7a3');

        System.out.println("손흥민".matches("[\uac00--\ud7a3]{3}"));
        System.out.println("이강인".matches("[\uac00--\ud7a3]{3}"));
        System.out.println("해리케인".matches("[\uac00--\ud7a3]{3}"));

        System.out.println("손흥민".matches("[가-힝]{3}"));
        System.out.println("이강인".matches("[가-힝]{3}"));
        System.out.println("해리케인".matches("[가-힝]{3}"));

        System.out.println("손흥민".matches("\\p{IsHangul}{3}}"));
        System.out.println("이강인".matches("\\p{IsHangul}{3}}"));
        System.out.println("해리케인".matches("\\p{IsHangul}{3}}"));

    }
}
