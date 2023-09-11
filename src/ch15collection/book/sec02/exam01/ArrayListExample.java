package ch15collection.book.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        //객체 추가
        list.add(new Board("제목 1 " , "내용 1", "글쓴이1"));
        list.add(new Board("제목 2 " , "내용 2", "글쓴이2"));
        list.add(new Board("제목 3 " , "내용 3", "글쓴이3"));
        list.add(new Board("제목 4 " , "내용 4", "글쓴이4"));
        list.add(new Board("제목 5 " , "내용 5", "글쓴이5"));


        //저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체의 수 : " + size);
        System.out.println();

        //특정 인덱스의 객체 가져오기
        Board board = list.get(2);
        System.out.println(board.getSubject()+"\t"+board.getContent()
                            + "\t"+board.getWriter());
        System.out.println();

        //모든객체를 하나씩 가져오기
        for(int i=0; i<list.size(); i++){
            Board b= list.get(i);
            System.out.println(b.getSubject()+"\t"+b.getContent()
                                +"\t"+b.getWriter());

        }
        System.out.println();

        //객체 삭제
        list.remove(2);
        list.remove(2);

        //향상된 for문으로 모든 객체를 하나씩 가져오기
        for(Board b : list){
            System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+
                                b.getWriter());
        }
        String a = list.toString();

        list.forEach(e-> System.out.println(e.getSubject()+"\t"+e.getContent()
                        +"\t"+e.getWriter()));



    }
}
