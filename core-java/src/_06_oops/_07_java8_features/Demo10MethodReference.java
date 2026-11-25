package _06_oops._07_java8_features;

public class Demo10MethodReference {
    public static void main(String[] args) {
        @FunctionalInterface
        interface NumberProcessor {
            int process(int number);
        }

        NumberProcessor ref1 = Demo10MethodReference::square;
        System.out.println(ref1.process(10));

        Demo10MethodReference demo10MethodReference = new Demo10MethodReference();
        NumberProcessor ref2 = demo10MethodReference::cube;
        System.out.println(ref2.process(10));

    }

    public static int square(int number) {
        return number * number;
    }

    public int cube(int number) {
        return number * number * number;
    }

}
