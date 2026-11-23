package _06_oops._02_inheritance;

public class Demo5 {
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

        A b = new B();
        System.out.println(b.x);//1 : variables from parent
        System.out.println(b.y);//2
        b.m1(); // B::m1 : methods from child class

        //System.out.println(b.z);//CTE
        //b.m2();// CTE

    }

}
