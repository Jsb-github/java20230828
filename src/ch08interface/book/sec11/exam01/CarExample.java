package ch08interface.book.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        //자동차 객체 생성
        Car car = new Car();

        //run()메소드 실행
        car.run();

        //타이어 교체

        car.tire1 = new KumhoTire();
        car.tire2 = new KumhoTire();

        //rub() 메소드 실행(다혀엉 : 실행 결과 다름)
        car.run();
    }
}
