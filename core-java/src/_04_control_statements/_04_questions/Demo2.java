package _04_control_statements._04_questions;

public class Demo2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        // 1 2 4 5
    }
}
