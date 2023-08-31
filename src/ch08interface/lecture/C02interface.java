package ch08interface.lecture;

public class C02interface  {
    public static void main(String[] args) {
        MyClass021 o1 = new MyClass021();
        MyInterface02 i2 = o1;

        System.out.println(System.identityHashCode(o1)); // 990368553
        System.out.println(System.identityHashCode(i2)); // 990368553

        MyInterface02 i3 = new MyClass021();

        System.out.println(System.identityHashCode(i3)); //1096979270

        MyInterface02 i4 = new MyClass022();
        System.out.println("o1 : ");


        o1.method01();
        o1.method02();

        System.out.println("i2 : ");

        i2.method01();
        i2.method02();

        System.out.println("i3 : ");

        i3.method01();
        i3.method02();

        System.out.println("i4 : ");

        i4.method01();;
        i4.method02();

    }
}


interface  MyInterface02{

   //추상 메소드
    abstract  public  void  method01();

    void method02(); // public, abstract
}

class  MyClass021 implements MyInterface02{

    @Override
    public void method01() {
        System.out.println("MyClass021.method01");
    }

    @Override
    public void method02() {
        System.out.println("MyClass021.method2");
    }
}


class MyClass022 implements MyInterface02{
    @Override
    public void method01() {
        System.out.println("MyClass022.method01");
    }

    @Override
    public void method02() {
        System.out.println("MyClass022.method02");
    }
}