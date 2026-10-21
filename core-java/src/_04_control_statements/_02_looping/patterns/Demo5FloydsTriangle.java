package _04_control_statements._02_looping.patterns;

public class Demo5FloydsTriangle {
    public static void main(String[] args) {
        /*

         1
         2 3
         4 5 6
         7 8 9 10
         11 12 13 14 15
         *
         */
        int num = 1;
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }


    }
}
