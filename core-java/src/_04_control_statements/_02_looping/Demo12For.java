package _04_control_statements._02_looping;

public class Demo12For {
    public static void main(String[] args) {
        //find factorial of given number
        // 5! = 1 * 2 * 3 * 4 * 5 = 120
        int number = 5;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
