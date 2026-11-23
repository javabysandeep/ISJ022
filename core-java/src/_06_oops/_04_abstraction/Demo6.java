package _06_oops._04_abstraction;

public class Demo6 {
    public static void main(String[] args) {
        interface I1{
            void m1();
            default void m2(){}
        }
        class A implements I1{
            @Override
            public void m1() {

            }

            @Override
            public void m2() {

            }
        }
        class B implements I1{
            @Override
            public void m1() {

            }
        }
        class C implements I1{
            @Override
            public void m1() {

            }
        }
        class D implements I1{
            @Override
            public void m1() {

            }
        }
    }
}
