package _06_oops._07_java8_features;

public class Demo1 {
    public static void main(String[] args) {
        interface Demo {
            public default void m1() {
                System.out.println("Demo::m1");
            }
        }
    }
}
