package ch08interface.book.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();

        rc.turOn();

        rc = new Audio();
        rc.turOn();
    }
}
