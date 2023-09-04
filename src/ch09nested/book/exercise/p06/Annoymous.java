package ch09nested.book.exercise.p06;

public class Annoymous {
    Vehicle field = new Vehicle(){
        @Override
        public void run() {
            System.out.println("자전거가 달립니다.");
        }
    };

    Vehicle field2 = () -> System.out.println("자전거가 달립니다. 2");

    void  method1(){
        Vehicle localvar = new Vehicle() {
            @Override
            public void run() {
                System.out.println("승용차가 달립니다.");
            }
        };
        localvar.run();

        Vehicle localvar2 = () -> System.out.println("승용차가 달립니다. 2");
        localvar2.run();
    }



    public  void method2(Vehicle vehicle){
        vehicle.run();
    }
}
