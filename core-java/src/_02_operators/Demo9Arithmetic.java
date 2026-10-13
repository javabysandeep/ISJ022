package _02_operators;

public class Demo9Arithmetic {
    public static void main(String[] args) {
        // find the sum of digits of given number (1+2+3+5) = 15
        int number = 12345;
        int sumOfDigits = 0;
        while (number != 0) {
            sumOfDigits = sumOfDigits + number % 10;
            number = number / 10;
        }
        System.out.println("sumOfDigits = " + sumOfDigits);


    }
}
