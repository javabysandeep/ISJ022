package _04_control_statements._02_looping.patterns;

public class Demo4 {
    public static void main(String[] args) {
        /*

         1
         2 2
         3 3 3
         4 4 4 4
         5 5 5 5 5

         *
         */

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }


    }
}
