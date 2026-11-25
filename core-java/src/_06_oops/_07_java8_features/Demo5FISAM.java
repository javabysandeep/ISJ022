package _06_oops._07_java8_features;

public class Demo5FISAM {
    public static void main(String[] args) {

        //01. traditional way of creating subclass
        class Child1 implements Runnable {
            @Override
            public void run() {
                System.out.println("Traditional way subclass");
            }
        }
        Runnable runnable = new Child1();
        runnable.run();
    }
}
