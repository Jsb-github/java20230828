package ch06class;

public class C01class {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();

        System.out.println(System.identityHashCode(o1));
        System.out.println("ol.age =" + o1.age);
        o1.age = 30;

        System.out.println("o1 = " + o1.age);
        MyClass01 o2 = o1;

        System.out.println("o2.age = " + o2.age);
        o1.age=60;

        System.out.println("o2 = " + o2.age);

    }
}


class MyClass01 {
    // instance fields
    //인스턴스가 가져하는 속성들
    int age;
    String name;
    String address;
    //intance meth  ods
    //인스터가 가져하는 기능들


}