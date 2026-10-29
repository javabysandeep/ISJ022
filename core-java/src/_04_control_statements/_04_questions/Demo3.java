package _04_control_statements._04_questions;

public class Demo3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }

            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
        // 1
    }
}
