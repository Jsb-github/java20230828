package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C19unmodifiable {
    public static void main(String[] args) {
        List<String> list1 = List.of("JAVA","SPRING","React","js");
        List<String> list2 = new ArrayList<>(list1);
        list2.add("html");

        System.out.println("list1.size() =" + list1.size());
        System.out.println("list2.size() =" + list2.size());

        System.out.println("프로그램종료");

    }
}
