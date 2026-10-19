package _04_control_statements._02_looping;

public class Demo8ForOdd {
    public static void main(String[] args) {
        //print odd numbers from 1 to 50
       /* for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println("i = " + i);
            }
        }*/

        for (int i = 1; i <= 50; i= i+2) {
            System.out.println("i = " + i);
        }

        System.out.println("Even numbers ");
        for (int i = 2; i <= 50; i= i+2) {
            System.out.println("i = " + i);
        }
    }
}
