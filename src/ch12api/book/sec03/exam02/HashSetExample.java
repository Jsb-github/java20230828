package ch12api.book.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {


    public static void main(String[] args) {
        HashSet hashSet = new HashSet(); // HashSet 컬렉션 생성

        Student s1 = new Student(1, "홍길동");
        hashSet.add(s1); //hashSet에 student 객체 저장
        System.out.println("저장 된 객체 수 "+hashSet.size());

        Student s2 = new Student(1,"홍길동");
        hashSet.add(s2);
        System.out.println("저장 된 객체 수 "+hashSet.size());


        Student s3 = new Student(2,"홍길동");
        hashSet.add(s3);
        System.out.println("저장 된 객체 수 "+hashSet.size());


    }
}
