package ch09nested.lecture;

public class C04access {
    public static void main(String[] args) {
        //static member는 instance member에 접근할 수 없다.
    }

    int instanceField;
    static  int staticField;

    static  class  StaicNestedClass{
        void method1(){
            System.out.println(staticField);
          //  System.out.println(instanceField); 접근 안됨
        }
    }
    //외부 클래스
    class  InnerClass{
        void  method1(){
            System.out.println(instanceField);
            System.out.println(staticField);
        }
    }
}
