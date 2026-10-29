package _04_control_statements._02_looping._02_while;

public class Demo9SumOfDigits {
    public static void main(String[] args) {
        int number = 98989898;
        int sum = 0;
        int digit;

        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        System.out.println("sum = " + sum);
    }
}
