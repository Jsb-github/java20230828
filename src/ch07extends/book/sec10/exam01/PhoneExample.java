package ch07extends.book.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        //Phone phone = new Phone();  안됨

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();  // Phone의 메소드
        smartPhone.internetSearch();
        smartPhone.turnOff(); // Phone의 메소드

        Phone phone = smartPhone;
        phone.turnOn();
        phone.turnOff();
        //phone.internetSearch(); // 안됨

    }
}
