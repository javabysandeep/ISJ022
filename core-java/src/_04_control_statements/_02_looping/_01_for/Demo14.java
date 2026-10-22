package _04_control_statements._02_looping._01_for;

public class Demo14 {
    public static void main(String[] args) {

        int left = 0;
        int right = 10;
        for (; left < right; ) {
            System.out.println(left + "\t" + right);
        }
        //infinite -- 0 10
    }
}
