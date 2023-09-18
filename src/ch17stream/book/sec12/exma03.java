package ch17stream.book.sec12;

import ch17stream.book.sec12.exam01.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class exma03 {
    public static void main(String[] args) {
        List<Student> totalis = new ArrayList<>();
        totalis.add(new Student("홍길동","남",92));
        totalis.add(new Student("김수영","여",87));
        totalis.add(new Student("김자바","남",95));
        totalis.add(new Student("오해용","여",93));

        Map<String,Double> map = totalis.stream()
                .collect(
                        Collectors.groupingBy(
                                s->s.getSex(),
                                Collectors.averagingDouble(s->s.getScore())
                        )
                );
        System.out.println(map);

    }
}
