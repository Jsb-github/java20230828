package ch16lambda.book.sec05.exam01;

public class MethodReferencExample {
    public static void main(String[] args) {
        Person person = new Person();


        //정적 메소드 일경우
        // 람다식
        //person.action((x,y)->Computer.staticMethod(x,y));
        person.action(Computer::staticMethod);


        //인스턴스 메소드 일경우
        Computer com = new Computer();
        //람식
        //person.action((x,y)->com.instanceMethod(x,y));
        person.action(com::instanceMethod);




    }
}
