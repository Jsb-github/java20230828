package ch15collection.book.exercise.p08;

import java.util.Objects;

public class Student {
    private    int studentNum;
    private   String name;

    public Student(){}

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getStudentNum() {
        return studentNum;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return studentNum == student.studentNum;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentNum=" + studentNum +
                ", name='" + name + '\'' +
                '}';
    }
}
