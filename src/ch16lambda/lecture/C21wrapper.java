package ch16lambda.lecture;

public class C21wrapper {
    public static void main(String[] args) {
        int i = 3;
        Integer j = Integer.valueOf(i);
        Object k = j;

        int l = 5;
        Integer m = 1;
        Object n = m;

        Object o = 7;

        //int p = o; //x
        Integer q = (Integer) o; // d위험
        int r= q;

        int s = 30; // 4byte
        long t = s;  // 8 byte

        Integer u =300;
        Integer v  = u;//

      float w = 3.14f; //4
      double x= w;
      Float y = 3.14f;
      //Double z = y; //x





    }
}
