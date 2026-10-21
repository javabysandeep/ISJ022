package _04_control_statements._02_looping.patterns;

public class Demo7 {
    public static void main(String[] args) {
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
