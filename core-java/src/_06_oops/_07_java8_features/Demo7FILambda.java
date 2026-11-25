package _06_oops._07_java8_features;

public class Demo7FILambda {
    public static void main(String[] args) {
       /*
            @FunctionalInterface
            public interface Runnable {
                void run();
            }
        */
        //03. creating subclass of a functional interface using lambda expression.
        Runnable runnable = () -> System.out.println("anonymous class way subclass");
        runnable.run();

    }
}
