package _04_control_statements._02_looping._01_for;

public class Demo11For {
    public static void main(String[] args) {
        //perfect number : given number = sum of its factor
        int number = 28;
        int sumOfFactors = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
                sumOfFactors += i;
            }
        }

        System.out.println("sumOfFactors = " + sumOfFactors);

        if (sumOfFactors == number) {
            System.out.println("Perfect number = " + number);
        } else {
            System.out.println("Not Perfect number = " + number);
        }
    }
}
