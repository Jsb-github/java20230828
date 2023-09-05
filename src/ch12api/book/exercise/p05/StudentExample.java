package ch12api.book.exercise.p05;

import java.util.HashSet;

public class StudentExample {
    public static void main(String[] args) {
        //Student를 저장하는 HashSet 생성
        HashSet<Student> hashSet = new HashSet<Student>();
        
        //Student 저장      같은 학번이므로 중복 저장이 안됨
        hashSet.add(new Student("1"));
        hashSet.add(new Student("1"));
        hashSet.add(new Student("3"));
       
        //저장된 Student 수 출력
        System.out.println("저장된 student 수 : " +hashSet.size());
        
    }
}
