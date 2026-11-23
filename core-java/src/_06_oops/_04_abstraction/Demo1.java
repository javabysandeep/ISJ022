package _06_oops._04_abstraction;

public class Demo1 {
    public static void main(String[] args) {

        abstract class A {
            abstract void m1();
        }

        abstract class C extends A {}


        class B extends A {
            @Override
            void m1() {
                System.out.println("abstract m1 overridden in concrete class");
            }
        }
        A a = new B();
        a.m1();

    }
}
