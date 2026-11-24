package _06_oops._05_final_keyword;

public class Demo1 {
    public static void main(String[] args) {
        //01. final class cannot be extended
        final class A {
        }
        //class B extends A {} //CTE

        //02. final methods cannot be overridden
        class Parent {
            final void m1() {
                System.out.println("Parent :: m1");
            }
        }
        class Child extends Parent {
            //CTE
           /* @Override
            void m1() {
                System.out.println("Child :: m1");
            }*/
        }
    }
}
