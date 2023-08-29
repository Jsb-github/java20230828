package ch07extends.lecture;

public class C03extends {
    public static void main(String[] args) {
        MySubClass031 o1 = new MySubClass031();
        o1.printName();
    }
}


class MyClass03 {
    private  String naem;

    void printName(){
        System.out.println("naem = " + naem);
        System.out.println("MyClass03.prinName");
    }
}

class  MySubClass031 extends  MyClass03{
    void setName(String name){
        // private field는 자식 클래스에서 사용할 수 없음
        // this.name=name;
    }
}

/*

* */