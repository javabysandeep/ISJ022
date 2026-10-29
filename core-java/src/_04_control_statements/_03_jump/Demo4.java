package _04_control_statements._03_jump;

public class Demo4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);

            if (i % 2 == 0) {
                continue;
            }

            System.out.println("*");
            System.out.println("**");
            System.out.println("***");
            System.out.println("****");
            System.out.println("*****");
        }
    }
}
