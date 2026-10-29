package _04_control_statements._02_looping._02_while;

public class Demo10ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reverse = 0; // 54321
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("reversed number = " + reverse);

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
