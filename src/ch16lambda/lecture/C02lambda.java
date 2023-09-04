package ch16lambda.lecture;

public class C02lambda {
    public static void main(String[] args) {
        MyInterface02 o1 = new MyInterface02() {
            @Override
            public void method() {
                System.out.println("C02lambda.method");
            }
        };

        // lambda
        // (파라미터 목록) - > {메소드 몸통}
        MyInterface02 o2 = () ->{
            System.out.println("C02lambda.main");
        };

        o1.method();

        //MyInterface02 o2 = () -> System.out.println("C02lambda.main");

    }
}

@FunctionalInterface
interface MyInterface02{

    // 파라미터 없는 메소드
    // 리턴 없음

    void method();

    }

