package _04_control_statements._02_looping.patterns;

public class Demo6 {
    public static void main(String[] args) {
//          *
//         ***
//         *****
//         *******
//        *********
        int number = 5;
        for (int row = 1; row <= number; row++) {
            //spaces
            for (int space = 1; space <= number - row + 1; space++) {
                System.out.print(" ");
            }
            //stars
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
