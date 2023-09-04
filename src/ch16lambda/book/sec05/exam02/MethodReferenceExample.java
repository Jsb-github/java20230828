package ch16lambda.book.sec05.exam02;



public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        //person.ordering((a, b) -> a.compareToIgnoreCase(b));
        // 위코드를 간결화 시키면 아래와 같다

        person.ordering(String::compareToIgnoreCase);
    }
}
