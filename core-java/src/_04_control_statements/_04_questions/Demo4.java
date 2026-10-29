package _04_control_statements._04_questions;

public class Demo4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue;
            }

            if (i == 2) {
                break;
            }
            System.out.println(i);
        }
        // 1 3 4 5
    }
}
