package ch06class;

public class C05class {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        MyClass05 o2 =  new MyClass05();

        System.out.println(System.identityHashCode(o1));

        o1.age=30;
        o1.model ="java"; // 클래스 필드 작성시 권장 하지않음.
        MyClass05.model = "Spring";  //권장

        System.out.println("o1.age = "+o1.age);  //30
        System.out.println("o2.age = "+o2.age);  //0
        System.out.println("o1.model = " + o1.model); //java
        System.out.println("o2.model = " + o2.model); //java

    }
}


class MyClass05{
    //속성 fields
    int age;  // instance field
    static  String model;

    // static field, class field, 정적 필드


    //기능
}