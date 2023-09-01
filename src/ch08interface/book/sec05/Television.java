package ch08interface.book.sec05;

import java.rmi.server.RMIClassLoader;

public class Television implements RemoteControl{
    //필드
    private  int volume;

    //추상메소드 재정의
    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
            if(volume< MAX_VOLUME){
                this.volume = MAX_VOLUME;
            } else if(volume > MIN_VOLUME) {
                this.volume =MIN_VOLUME;
            }else {
                this.volume=volume;
            }
        System.out.println("현재 TV볼륨 : "+volume);
    }
}
