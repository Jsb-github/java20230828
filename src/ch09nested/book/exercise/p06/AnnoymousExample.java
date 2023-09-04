package ch09nested.book.exercise.p06;

public class AnnoymousExample {
    public static void main(String[] args) {
        Annoymous anony = new Annoymous();
        anony.field.run();
        anony.method1();
        anony.method2(new Vehicle() {
            @Override
            public void run() {
                System.out.println("트럭이 달립니다.");
            }
        });

        anony.method2(() -> System.out.println("트럭이 달립니다. 2"));
    }
}
