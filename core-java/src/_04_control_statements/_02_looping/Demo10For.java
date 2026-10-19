package _04_control_statements._02_looping;

public class Demo10For {
    public static void main(String[] args) {
        //find the factors of a given number
        // 6 = 1, 2, 3
        // factor range = 1 to number/2
        int number = 100; // 1,2, 4, 5, 10, 20, 25, 50
        // 100 % 1 == 0
        // 100 % 2 == 0
        // 100 % 3 == 0 fail
        // 100 % 4 == 0
        // 100 % 5 == 0
        // 100 % 6 == 0 fail
        // 100 % 7 == 0 fail
        // 100 % 8 == 0 fail
        // 100 % 9 == 0 fail
        // 100 % 10 == 0
        // ........
        // 100 % 50 == 0

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("factor = " + i);
            }
        }


    }
}
