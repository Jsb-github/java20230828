package ch12api.lecture;

public class C05hashcode {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        int hashCode1 = o1.hashCode();
        int hashCode2 = o2.hashCode();

        System.out.println(hashCode1);
        System.out.println(hashCode2);

        Object o3 = o2;
        System.out.println(o3.hashCode());
    }
}
