package ch07extends.book.sec03.exam01;

public class SmartPhoneExample {
    public static void main(String[] args) {
        //SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("겔럭시","은색");


        //phone으로부터 상속 받은 필드 읽기
        System.out.println("모델 : "+myPhone.model);
        System.out.println("컬러 : "+myPhone.color);
    }
}
