package ch08interface.book.sec02;

public class Television implements RemoteControl{
    @Override
    public void turOn() {
        System.out.println("Tv를 켭니다.");
    }
}
