package _04_control_statements._01_conditional;

public class Demo5 {
    public static void main(String[] args) {
        //find maximum of three numbers
        int number1 = 13;
        int number2 = 11;
        int number3 = 13;

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is max");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is max");
        } else {
            System.out.println(number3 + " is max");
        }
    }
}
