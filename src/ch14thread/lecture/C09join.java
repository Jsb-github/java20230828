package ch14thread.lecture;

import java.util.regex.Pattern;

public class C09join {
    public static void main(String[] args) {
        //joun : 다른 쓰레드의 종료를 기다림


        Thread t1 = new Thread(()->{
            for(int i=0; i<5; i++){
                System.out.println("t1 thread");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    throw  new RuntimeException(e);
                }
            }
        });
        t1.start();


        for(int i=0; i<5; i++){
            System.out.println("main thread!!!!!!!");
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
        }


        // join  다른 쓰레드의 종료를 기다리며

        try {
            t1.join();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }


        for (int i =0; i<5; i++){
            System.out.println("main thread");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
        }
    }
}
