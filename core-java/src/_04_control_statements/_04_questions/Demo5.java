package _04_control_statements._04_questions;

public class Demo5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (j == 2)
                    break;

                System.out.println(i + " " + j);
            }
        }


        // 1 1
        // 2,1
        //3,1
    }
}
