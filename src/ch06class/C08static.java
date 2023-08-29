package ch06class;

public class C08static {
    public static void main(String[] args) {
        MyClass08 o1 = new MyClass08();

        //static member는 클래스 이름으로 바로 접근하세요.
        MyClass08.name = "Spring";
        MyClass08.printname();

    }
}

class MyClass08{
    static  String name;

    static  void printname(){
        System.out.println("name = " + name);
    }
}