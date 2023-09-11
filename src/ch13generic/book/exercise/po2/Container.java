package ch13generic.book.exercise.po2;

public class Container <T>{
    private T field;

    public T get() {
        return field;
    }

    public void set(T field) {
        this.field = field;
    }
}
