package _04_control_statements._02_looping._01_for;

public class Demo9ForSum {
    public static void main(String[] args) {
        int sum = 0;
        // find the sum of numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            sum += i; // sum = sum + i;
        }
        System.out.println("sum = " + sum);
    }
}
