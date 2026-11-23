package _06_oops._02_inheritance;

public class Demo7 {
    public static void main(String[] args) {
        abstract class A {
            A() {
                System.out.println("A:: constructor");

            }
            void m1() {
                System.out.println("A:: m1");
            }
        }

        class B extends A {
            B() {
                super();
                System.out.println("B:: constructor");
            }

            @Override
            void m1() {
                super.m1();
                System.out.println("B:: m1");
            }
        }

        //A a = new A();//CTE : we cannot create object of an abstract class
        A a = new B();
        a.m1();
    }
}
