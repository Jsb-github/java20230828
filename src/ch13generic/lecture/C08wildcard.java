package ch13generic.lecture;

public class C08wildcard {
    public static void main(String[] args) {
        Myclass08<?>  o1 = new Myclass08<Animal>();
        Myclass08<?>  o2 = new Myclass08<Dog>();
        Myclass08<?>  o3 = new Myclass08<Cat>();
        Myclass08<?>  o4 = new Myclass08<Object>();

        o1.equals(null);
        o2.toString();
        o3.hashCode();

        //Myclass08<Object> o5 = new Myclass08<Dog>();

    }

    public void otherMethod(){
        someMethod(new Myclass08<Object>());
        someMethod(new Myclass08<Animal>());
        someMethod(new Myclass08<Cat>());
    }

    public  void someMethod(Myclass08<?> param){
        param.hashCode();
        param.equals(null);
        param.toString();
    }

}


class Myclass08<T>{

}