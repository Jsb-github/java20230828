package ch13generic.book.sec03.exam01;

public class GeneriExample {
    public static  <T> Box<T> boxing(T t){
        Box<T> box = new Box<>();
        box.setT(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intvalue = box1.getT();
        System.out.println(intvalue);


        Box<String> box2 =boxing("홍길동");
        String strvalue = box2.getT();
        System.out.println(strvalue);

    }
}
