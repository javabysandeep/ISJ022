package _04_control_statements._02_looping._02_while;

public class Demo8SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;
        int digit = 0;

        digit = number % 10;
        sum = sum + digit;
        number = number / 10;


        digit = number % 10;
        sum = sum + digit;
        number = number / 10;

        digit = number % 10;
        sum = sum + digit;
        number = number / 10;


        digit = number % 10;
        sum = sum + digit;
        number = number / 10;


        digit = number % 10;
        sum = sum + digit;
        number = number / 10;

        System.out.println("sum = " + sum);


        // 12345 % 10 = 5
        // 12345 / 10 = 1234

        // 1234 % 10 = 4
        // 1234 / 10 = 123

        // 123 % 10 = 3
        //123 / 10 = 12

        // 12 % 10 = 2
        // 12 / 10 = 1

        // 1 % 10 = 1
        // 1 / 10 = 0
    }
}
