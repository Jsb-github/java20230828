package ch07extends.book.sec03.exam01;

public class SmartPhone extends Phone{
    //자식 생성자 선언
    SmartPhone(String model, String color){
        super(); // 생략가능(컴파일시 자동 추가됨)
        this.model =model;
        this.color =color;
        System.out.println("SmartPhone(Stirng model," +
                "String color)생성자 실행");
    }
}
