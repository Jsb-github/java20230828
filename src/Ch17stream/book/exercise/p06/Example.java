package Ch17stream.book.exercise.p06;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동",30),
                new Member("신용권",40),
                new Member("김자바",25)
        );

        System.out.println("회원 출력");
        list.stream()
                .map(x->x.getAge())
                .forEach(x-> System.out.println(x));

        //
        System.out.println("나이들의 합 구해서 출력");
        Integer reduce = list.stream()
                .map(m->m.getAge())
//                .reduce(0,(x,y)->x+y );
                .reduce(0,Integer::sum);
        System.out.println(reduce);

        //
        System.out.println("가장 많은 나이 reduce로 구해서 출력");
        Integer reduce1 = list.stream()
                .map(m->m.getAge())
                .reduce(Integer.MIN_VALUE, Math::max);


        System.out.println("reduce1 = " + reduce1);
        //
        System.out.println("가장 작은 나이 reduce로 구해서 출력");
        Integer reduce2 = list.stream()
                .map(m -> m.getAge())
                .reduce(Integer .MAX_VALUE, Math::min);

        System.out.println("reduce1 = " + reduce2);
    }
}
