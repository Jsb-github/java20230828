package ch07extends.book.sec03.exam02;



public class SmartPhoneExample {
    public static void main(String[] args) {
        //SmartPhone 객체 생성
        SmartPhone smartPhone = new SmartPhone("갤럭시","은색");

        //phone으로 부터  상속 받은 필드 읽기

        System.out.println("모델 : " + smartPhone.model);
        System.out.println("컬러 : " + smartPhone.color);
    }
}
