package ch14thread.lecture;

import java.util.concurrent.atomic.AtomicInteger;

public class C12atomic {
    private static AtomicInteger value= new AtomicInteger();
    public static void main(String[] args) {

        Thread thread1 = new Thread(()->{
            for (int i = 0; i <100000 ; i++) {
                value.getAndIncrement();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 100000; i++) {
                value.getAndIncrement();
            }
        });
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("value = "+value);
    }
}
