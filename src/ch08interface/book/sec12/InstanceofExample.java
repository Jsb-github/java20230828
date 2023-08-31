package ch08interface.book.sec12;



public class InstanceofExample {
    public static void main(String[] args) {
        //구현 객 체 생성
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        //ride() 메소드 호출시 구현 객체를 매개값으로 전달
        ride(taxi);
        System.out.println();
        ride(bus);
    }
        public  static  void ride(Vehicle vehicle){
        //방법1
            /*
            if(vehicle instanceof  Bus){
                Bus bus = new Bus();
                bus.checkFare();
            }
            */
            //방법2
            if(vehicle instanceof  Bus bus){
                bus.checkFare();
            }

            vehicle.run();
        }

}
