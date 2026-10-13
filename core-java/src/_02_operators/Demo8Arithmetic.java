package _02_operators;

public class Demo8Arithmetic {
    public static void main(String[] args) {
        // find the sum of digits of given number (1+2+3+5) = 15
        int number = 12345;
        int sumOfDigits = 0;
        int lastDigit = 0;

        lastDigit = number % 10; //5
        sumOfDigits = sumOfDigits + lastDigit; // 0 +5 = 5
        number = number / 10; // 12345 / 10 = 1234

        lastDigit = number % 10; // 1234 %10 = 4
        sumOfDigits = sumOfDigits + lastDigit; // 5 + 4 = 9
        number = number / 10;  //1234 / 10 = 123

        lastDigit = number % 10; //123 % 10 = 3
        sumOfDigits = sumOfDigits + lastDigit; // 9 + 3 = 12
        number = number / 10; // 123 /10 = 12

        lastDigit = number % 10; //12 % 10 = 2
        sumOfDigits = sumOfDigits + lastDigit; // 12 +2 = 14
        number = number / 10; // 12 / 10 = 1

        lastDigit = number % 10; // 1 % 10 = 1
        sumOfDigits = sumOfDigits + lastDigit; // 14 + 1 = 15
        number = number / 10; // 1/ 10 = 0

        System.out.println("sumOfDigits = " + sumOfDigits);


    }
}
