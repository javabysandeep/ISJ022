package _06_oops._07_java8_features;

public class Demo4FunctionalInterface {
    public static void main(String[] args) {

        @FunctionalInterface
        interface I1 {
            void m1();

            static void m2() {
                System.out.println("I1::m2");
            }

            default void m3() {
                System.out.println("I1::m3");

            }
        }


    }
}
