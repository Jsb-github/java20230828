package ch08interface.lecture;

import ch08interface.book.sec08.Searchable;

import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C09cast {
    public static void main(String[] args) {
        CharSequence c = "java";


        String s = (String) c; // ok
        Object o=  (Object) c; //ok
        Searchable se = (Searchable)c;
        Comparable co = (Comparable)c;
        Constable con = (Constable)c;
        ConstantDesc cd = (ConstantDesc)c;

        //Number n = (Number)c;//x

        System.out.println("프로그램 종료");
    }
}


