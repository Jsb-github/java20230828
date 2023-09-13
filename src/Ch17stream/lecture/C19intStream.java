package Ch17stream.lecture;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class C19intStream {
    public static void main(String[] args) {
        IntStream.of(9, 10, 0, 8, 3, 1, 22, 77, 33);

        //최대값 구하기
        OptionalInt max = IntStream.of(9, 10, 0, 8, 3, 1, 22, 77, 33).max();
        System.out.println("max1 = " + max.getAsInt());

        //최소값 구하기
        OptionalInt min = IntStream.of(9, 10, 0, 8, 3, 1, 22, 77, 33).min();
        System.out.println("max = " + min.getAsInt());

        //평균 구하기
        OptionalDouble avg = IntStream.of(9, 10, 0, 8, 3, 1, 22, 77, 33).average();
        System.out.println("avg = " + avg.getAsDouble());

    }
}
