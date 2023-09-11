package 연습코드;

public class clss2 {
    public static void main(String[] args) {
        Grand gg = new Grand();
        Grand gr = new Child();
        Child cl = new Child();

       String a =  cl.setName("홍길동");

        System.out.println(gr.name="홍길동");
        System.out.println(cl.name="이길동");
        System.out.println();

        gr.print();
        cl.print();
    }
}


class Grand{
     String name;
     int age;

    public Grand() {
    }



    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public void print(){
        System.out.println("이름 : " + this.name + "나이 : " + this.age);
    }
}

class Child extends Grand{
     String name;
     int age;


    public void print(){

    }


}


