package ch13generic.book.sec02.exma01;

public class GenericExample {
    public static void main(String[] args) {
        //K 는 tv로 M 은 String으로 대체
        Product<Tv,String> product1 = new Product<>();

        //Setter 매개값은 반드시 Tv와 String을 제공
        product1.setKind(new Tv());
        product1.setModel("스마트 TV");

        //getter리턴값은 Tv와 Strung이 됨
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        //============================================
        Product<Car,String> product2 = new Product<>();

        //Setter 매개값은 반드시 car와 string을 제공
        product2.setKind(new Car());
        product2.setModel("SUV자동차");

    }
}
