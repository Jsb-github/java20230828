package ch13generic.book.exercise.P03;

public class Container<T, T1> {
    private T t;
    private T1 t1;

    public T getKey() {
        return t;
    }

    public void set(T t,T1 t1) {
        this.t = t;
        this.t1 = t1;
    }

    public T1 getValue() {
        return t1;
    }


}
