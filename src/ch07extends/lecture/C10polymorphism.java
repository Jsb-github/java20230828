package ch07extends.lecture;

import java.security.spec.RSAOtherPrimeInfo;

public class C10polymorphism {
    public static void main(String[] args) {
        Malamute10 dog1 = new Malamute10();
        Chihuahua10 dog2 = new Chihuahua10();

        Canidae10 can1 = dog1;
        Canidae10 can2=  dog2;

        Animal10 ani1 = dog1;
        Animal10 ani2 = dog2;

        //dog1 = ani1 ; / /실행 안됨

        dog1.breath();
        dog2.breath();

        dog1.cry();
        can1.cry();
        ani1.cry();

        dog2.cry();
        can2.cry();
        can2.cry();;
    }
}


class Animal10 {

    public  void breath(){
        System.out.println("숨쉬다");
    }
    
    public void cry(){
        System.out.println("동물이 운다");
    }
}

class Canidae10 extends Animal10{

   
}

class Malamute10 extends  Canidae10{
    public void cry() {
        System.out.println("멍멍");
    }
}

class  Chihuahua10 extends  Canidae10{
    public void cry() {
        System.out.println("왈왈");
    }
}