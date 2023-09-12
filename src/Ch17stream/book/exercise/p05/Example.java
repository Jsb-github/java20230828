package Ch17stream.book.exercise.p05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports labda expressions"
        );

        list.stream()
                .filter(n->n.toLowerCase().contains("java"))
                .forEach(n-> System.out.println(n));

        System.out.println("indexOf");
        list.stream()
                .filter(s->s.toUpperCase().indexOf("java") != -1)
                .forEach(s-> System.out.println(s));
    }
}
