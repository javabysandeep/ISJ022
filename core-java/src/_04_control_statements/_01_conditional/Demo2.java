package _04_control_statements._01_conditional;

public class Demo2 {
    public static void main(String[] args) {
        int number = 124;

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        }


        if (number % 2 != 0) {
            System.out.println(number + " is an odd number.");
        }
    }
}
