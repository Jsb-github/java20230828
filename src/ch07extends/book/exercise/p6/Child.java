package ch07extends.book.exercise.p6;



public class Child extends Parent {

    public  int studentNo;

//    Child(String name, int StudentNo){
//        this.name = name;
//        this.studentNo =studentNo;
//    }

//    Child(String name){
//        super(name);
//    }


    public Child(int studentNo) {
        this.studentNo = studentNo;
    }

    public Child(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }

}
