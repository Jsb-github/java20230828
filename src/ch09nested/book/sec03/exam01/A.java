package ch09nested.book.sec03.exam01;

public class A {
    //인스턴스 멤버 클래스
    static class B{}

    //인스턴스 필드값으로 B객체 대입
    B field1 = new B();

    //정적 필드 값으로 B객체 대입
    static B field2 = new B();

    //생성자
    A(){
        B b = new B();
    }

    //인스터스 메소드
    void method01(){
        B b = new B();
    }

    //정적 메소드
    static void  method02(){
        B b = new B();
    }
}
