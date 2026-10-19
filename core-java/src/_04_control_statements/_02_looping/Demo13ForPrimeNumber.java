package _04_control_statements._02_looping;

public class Demo13ForPrimeNumber {
    public static void main(String[] args) {
        // prime number = number which is only divisible by 1 and number itself.
        // prime number do not have any factors apart from 1 and number itself
        int number = 19;
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not Prime number");
        }
    }
}
