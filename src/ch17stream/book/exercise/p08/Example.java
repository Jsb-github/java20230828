package ch17stream.book.exercise.p08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동","개발자"),
                new Member("김나리","디자이너"),
                new Member("신용권","개발자")
        );

        System.out.println("개발자");

      list.stream()
                .filter(s->s.getJob().equals("개발자"))
                .toList()
                .forEach(System.out::println);;



        System.out.println("[디자이너]");
        list.stream()
                .filter(s->s.getJob().equals("디자이너"))
                .toList()
                .forEach(System.out::println);

        System.out.println();


        Map<String, List<Member>> map =
                list.stream()
                        .collect(Collectors.groupingBy(s->s.getJob()));

        map.get("개발자")
                .forEach(System.out::println);

        System.out.println();

        map.get("디자이너")
                .forEach(System.out::println);

    }
}