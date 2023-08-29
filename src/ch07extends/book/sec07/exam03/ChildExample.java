package ch07extends.book.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        //객체 생성 및 자동 타입 형 변환
        Parent parent = new Child();
        
        //Parent 타입으로 필드와 메소드 사용
        parent.field ="data1";
        parent.method1();
        parent.method2();
        
        /*
        parent.field2 = "data2";//불가능
        parent.method3(); //불가능
        */
        
        //강제 타입 형변환
        Child child = (Child) parent;
        
        //child 타입으로 필드와 메소드 사용
        child.field2="data2";  // 가능
        child.method03();  //가능
    }
}
