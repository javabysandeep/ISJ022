package _06_oops._07_java8_features;

public class Demo6FIAnonymous {
    public static void main(String[] args) {
       /*
            @FunctionalInterface
            public interface Runnable {
                void run();
            }
        */
        //02. creating subclass of a functional interface using anonymous class way.

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous class way subclass");
            }
        };
        runnable.run();

    }
}
