package _06_oops._06_anonymous;

public class Demo2 {
    public static void main(String[] args) {
        abstract class A {
            public abstract void show();
        }

        A a = new A() {
            public void show() {
                System.out.println("show");
            }
        };
        a.show();
    }
}
