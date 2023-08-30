package ch07extends.lecture;

public class C24constructor {
    public static void main(String[] args) {

    }
}



class MyClass24{

    int age;

    // 파라미터 있는 생성자 작성하면
    // 파리미터 없는 생성자(기본생성자,0-args-constructor)가
    // 자동으로 삽입되지 않느다.
    MyClass24(int age){
        this.age=age;
    }
}

class MySubClass241 extends  MyClass24{


    MySubClass241(){
        //명시적으로 상위 클래스의 생성자 호출 코드 작성
        super(30);
    }
}