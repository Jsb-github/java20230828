package ch16lambda.lecture;

public class C20wrapper {
    public static void main(String[] args) {
        // wrapper class : 기본타입을 감싸고 있는 클래스

        // 기본 타입 : byte, short, int, long, float ,double, char, boolean
        // wrapper class : Byte Short, Integer, Long, Float, Double, Character , Boolean

        // boxing : 기본 타입 -> 참조 타입
        // unboxing : 참조 타입 -> 기본 타입


        //boxing
        int i = 500;
        //Integer j = new Integer(i);
        Integer k = Integer.valueOf(i);

        System.out.println(i);
//        System.out.println(j);

    //unboxing
    Integer l = Integer.valueOf(1000) ;
    int m = l.intValue();;

        System.out.println(l);
        System.out.println(m);

        //auto bixing
        int n= 777;
        Integer o = n; // auto boxing

        // auto unboxing
        Integer p = Integer.valueOf(888);
      //  int q1= p.intValue();
        int  q2 = p;


}
}