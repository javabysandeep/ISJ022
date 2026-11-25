package _06_oops._07_java8_features;

public class Demo8FIMethodReference {
    public static void main(String[] args) {
       /*
            @FunctionalInterface
            public interface Runnable {
                void run();
            }
        */
        //04. creating subclass of a functional interface using method reference.
        Runnable runnable = Demo8FIMethodReference::show;
        runnable.run();

    }

    public static void show() {
        System.out.println("some logic");
    }
}
