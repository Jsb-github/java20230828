package ch07extends.book.sec03.exam02;

public class Phone {
    //필드선언
    public  String model;
    public  String color;
    
    //매개 변수를 갖는 생성자 선언
    
    Phone(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color)생성자 실행");
    }
}
