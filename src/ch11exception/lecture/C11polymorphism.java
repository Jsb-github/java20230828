package ch11exception.lecture;

public class C11polymorphism {
    public static void main(String[] args) {
        try {

        }catch (NullPointerException e){
            // 동일한 예외처리 코드
        }catch (ArithmeticException e){
            // 동일한 예외처리 코드
        }

        try {
            //NullPointerException
            //ArithmeticException
        }catch (RuntimeException e){

        }
    }
}
