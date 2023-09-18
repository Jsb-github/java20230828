package ch17stream.lecture;

import  java.util.*;
import java.util.stream.Collectors;

public class C24grouping {
    public static void main(String[] args) {
        List<String> list = List.of(
                "java",
                "spring",
                "css",
                "html",
                "react",
                "vue",
                "jquery",
                "jsp"
        );


        Map<Integer, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(String::length));


        collect.entrySet()
                .forEach(e -> System.out.println(e.getKey()+":"+e.getValue()));


    }
}
