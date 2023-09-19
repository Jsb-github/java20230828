package ch14thread.lecture;

public class C13syncronized {
    public static void main(String[] args) throws InterruptedException {
        MyBox box = new MyBox(0);

        Thread threadA = new Thread(new Task(box));

        threadA.start();

        Thread threadB = new Thread(new Task(box));

        threadB.start();


            threadA.join();
            threadB.join();



        System.out.println("box.vlaue = " + box.getValue());
    }
}

class Task implements Runnable{
    private  MyBox box;

    public Task() {
    }

    public Task(MyBox box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            box.increment();
        }

    }
}


class MyBox{
    private int value;
    // monitor lock
    private  Object lock = new Object();
    public MyBox() {
    }

    public MyBox(int value) {
        this.value = value;
    }

    public void increment(){

        // synchronized block
        synchronized (lock) {
            value++;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
