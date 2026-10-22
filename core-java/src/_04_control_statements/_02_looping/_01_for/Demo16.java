package _04_control_statements._02_looping._01_for;

public class Demo16 {
    public static void main(String[] args) {

        int left = 0;
        int right = 10;
        for (; left < right; right--) {
            System.out.println(left + "\t" + right);
        }
        //0 10
        //0 9
        // 0 1
    }
}
