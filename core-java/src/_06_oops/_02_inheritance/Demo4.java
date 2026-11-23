package _06_oops._02_inheritance;

public class Demo4 {
    public static void main(String[] args) {
        class A {
            int x = 1;
            int y = 2;

            void m1() {
                System.out.println("A::m1");
            }
        }
        class B extends A {
            int x = 11;
            int y = 22;
            int z = 33;

            void m1() {
                System.out.println("B::m1");
            }

            void m2() {
                System.out.println("B::m2");
            }
        }

        B b = new B();
        System.out.println(b.x);//11
        System.out.println(b.y);//22
        System.out.println(b.z);//33
        b.m1(); // B::m1
        b.m2();// B::m2
    }

}
