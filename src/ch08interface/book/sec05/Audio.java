package ch08interface.book.sec05;

public class Audio implements RemoteControl{
    //필드
    private int volume;
    //추상 메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>MAX_VOLUME){
            this.volume = MAX_VOLUME;
        }else if(volume<MIN_VOLUME){
            this.volume = MIN_VOLUME;
        }else{
            this.volume =volume;
        }
        System.out.println("현재 Audio 불륨" + volume);
    }


    //필드
    private int memoryVolume; //추가 필드선언

    //디폴트 메소드 재정의


    @Override
    public void setMute(boolean mute) {

        if(mute){
            this.memoryVolume =this.volume;
            System.out.println("무음처리합니다");
            setVolume(MIN_VOLUME);
        }else {
            //mute가 false 일경우 원래 불륨으로 복원하는 코드
            System.out.println("무음 해제합니다");
            setVolume(this.memoryVolume);
        }
    }
}
