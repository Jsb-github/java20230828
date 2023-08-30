package ch07extends.book.exercise.p10;

public abstract class Machine {
    public void powerOn(){}
    public void powerOff(){}
    
    public abstract void work();
    
}

class  Computer extends Machine{
    //추상 메소드 재정의 해야함

    @Override
    public void work() {
        System.out.println("걷는다");
    }
}
