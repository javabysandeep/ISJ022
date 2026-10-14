package _02_operators;

public class Demo19ConditionalOperators {
    public static void main(String[] args) {
        System.out.println(true ? "its true" : "its false");//its true
        System.out.println(false ? "its true" : "its false"); //its false

        int number = 100;
        System.out.println(number % 2 == 0 ? "even" : "odd");

        int number1 = 100;
        int number2 = 200;


        System.out.println(number1 > number2 ? number1 : number2);
    }
}
