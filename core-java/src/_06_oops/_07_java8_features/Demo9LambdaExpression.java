package _06_oops._07_java8_features;

public class Demo9LambdaExpression {
    public static void main(String[] args) {

        @FunctionalInterface
        interface NumberProcessor {
            int process(int number);
        }

        NumberProcessor ref = (int number) -> number * number;
        System.out.println(ref.process(10)); //100

    }
}
