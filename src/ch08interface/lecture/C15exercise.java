package ch08interface.lecture;

public class C15exercise {
    MyInterface15 field;

    public static void main(String[] args) {
        //확인문제 3 - 보기1
        //필드가 인터페이스 타입 일경우 다양한 구현 객체를 대입할 수 있다
        C15exercise o1 = new C15exercise();
        o1.field = new MyClass151();
        o1.field = new MyClass152();
        //확인문제 3 - 보기2
        //매개 변수가 인터페이스 타입일 경우 다양한 구현 객체를 대입할 수 있다.
        method(new MyClass151());
        method(new MyClass152());

       //확인문제 3 - 보기3
        //배열이 인터페이스 타입일 경우 다양한 구현객체를 대입할 수 있다
       MyInterface15[] arr = new MyInterface15[3];
       arr[0] = new MyClass151();
       arr[1] = new MyClass152();
    }

    public static void method(MyInterface15 param){

    }
}

interface  MyInterface15{

}

class MyClass151 implements MyInterface15{}

class MyClass152 implements MyInterface15{}
