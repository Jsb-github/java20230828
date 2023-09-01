package ch08interface.lecture;

public class C11default {
    public static void main(String[] args) {
        MyInterface11 o1 =  new MyClass111();
        MyInterface11 o2 = new MyClass112();

        o1.method();
        o1.method2();

        System.out.println();

        o2.method();
        o2.method2();
    }
}


interface MyInterface11{
    void  method(); // 몸통 없는 추상메소드
    default  void method2(){
        //몸통이 있는 instance 메소드
        System.out.println("MyInterface11.method2");
    }
}

class  MyClass111 implements  MyInterface11{
    @Override
    public void method() {
        System.out.println("MyClass111.method");
    }
}


class  MyClass112 implements MyInterface11{
    @Override
    public void method() {
        System.out.println("MyClass112.method");
    }
}