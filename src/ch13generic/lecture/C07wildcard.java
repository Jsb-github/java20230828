package ch13generic.lecture;

public class C07wildcard {
    public static void main(String[] args) {

    }


    public void otherMethod(){
        someMethod1(new MyClass07<Dog>());
        someMethod1(new MyClass07<Cat>());

        someMethod2(new MyClass07<Animal>());
        someMethod2(new MyClass07<Object>());

    }

    public  void someMethod1(MyClass07 <? extends Animal> param){
        Animal item = param.getItem(); // 안전
    }

    public void someMethod2(MyClass07<? super  Animal> param){
        param.setItem(new Animal());
//        param.setItem(new Dog());
//        param.setItem(new Cat());
    }
}


class MyClass07<T>{
    private  T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}