package Exam;

public class Exam5 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.run();
    }
}


class Bus extends Car {
    // run 메소드를 오버라이드 하세요. 메소드의 접근 제한자는 public이어야 합니다.
    public void run(){
        System.out.println("차가달리면서 다음정거장을 안내합니다");
    }
}

 class Car {
    public void run() {
        System.out.println("차가 달립니다.");
    }

    public void stop() {
        System.out.println("차가 멈춥니다.");
    }

    public void horn() {
        System.out.println("경적을 울립니다.");
    }
}