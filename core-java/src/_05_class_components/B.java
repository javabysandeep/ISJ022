package _05_class_components;

public class B {
    public void im1() {
        //call A class - im1, sm1
        A.sm1();
        A a = new A();
        a.im1();

    }

    public static void sm1() {
        //call A class - im1, sm1
        A.sm1();
        A a = new A();
        a.im1();
    }

    public static void main(String[] args) {
        B b = new B();
        b.im1();
        B.sm1();
    }
}
