package ch16lambda.lecture;

import java.util.Arrays;
import java.util.Comparator;

public class C25Arrays {
    public static void main(String[] args) {
        int [] arr1 = {3,1,5,9,7};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        Student1[] arr2 = {new Student1("이강인"),
                          new Student1("손흥민"),
                         new Student1("김민재")};
        Arrays.sort(arr2, (x,y)->x.getName().compareTo(y.getName())) ;
        System.out.println(Arrays.toString(arr2));
    }
}


class Student1{
    private  String name;

    public Student1() {
    }

    public Student1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                '}';
    }
}