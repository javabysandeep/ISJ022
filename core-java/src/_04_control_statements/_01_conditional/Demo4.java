package _04_control_statements._01_conditional;

public class Demo4 {
    public static void main(String[] args) {
        //find maximum of three numbers
        int number1 = 11;
        int number2 = 2;
        int number3 = 32;

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is max");
        }

        if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is max");
        }

        if (number3 > number1 && number3 > number2) {
            System.out.println(number3 + " is max");
        }
    }
}
