package ch08interface.book.sec02;

public class Audio implements RemoteControl{

    @Override
    public void turOn() {
        System.out.println("Audio를 켭니다");
    }
}
