package _04_control_statements._02_looping._01_for;

public class Demo17 {
    public static void main(String[] args) {

        int left = 0;
        int right = 10;
        for (; left < right; left++, right--) {
            System.out.println(left + "\t" + right);
        }
      //0 10
      //1 9
      //2 8
      //3 7
      //4 6

    }
}
