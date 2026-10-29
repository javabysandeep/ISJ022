package _04_control_statements._02_looping._02_while;

public class Demo11Palindrome {
    public static void main(String[] args) {
        // palindrome number = given number == its reverse
        int number = 400;
        int originalNumber = number;
        int reverse = 0; // 121
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("reversed number = " + reverse);
        System.out.println(
                originalNumber == reverse
                ? "palindrome"
                : "not a palindrome");

    }
}
