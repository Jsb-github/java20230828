package ch14thread.lecture;

import java.awt.*;

public class C07runnable {
    public static void main(String[] args) {
       Thread t1 = new Thread(()->{
           Toolkit toolkit = Toolkit.getDefaultToolkit();
           for(int i=0; i<5; i++){
               toolkit.beep();
               try {
                   Thread.sleep(500);
               }catch (InterruptedException e){
                   throw  new RuntimeException(e);
               }
           }
       });
       t1.start();

       Thread t2 = new Thread(()->{
           for(int i=0; i<5; i++){
               System.out.println("띵");
               try {
                   Thread.sleep(500);
               }catch (InterruptedException e){
                   throw  new RuntimeException(e);
               }
           }
       });
       t2.start();
    }
}
