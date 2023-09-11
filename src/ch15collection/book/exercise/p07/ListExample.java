package ch15collection.book.exercise.p07;

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for (Board board : list){
            System.out.println(board.getTitle() + "-" + board.getConetent());
        }


       boolean contains =  list.contains(list.get(1));
        System.out.println("contains = " + contains);

        String a= "1";
        String b= a;

        System.out.println("=========================");
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println("=========================");


    }
}
