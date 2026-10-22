package _04_control_statements._02_looping._01_for;

public class Demo6For {
    public static void main(String[] args) {
        // print a table of a given number
        int number = 10;
        //10 = 1 * 10
        //20 = 2 * 10
        //30 = 3 * 10
        //40 = 4 * 10
        //50 = 5 * 10
        //60 = 6 * 10
        //70 = 7 * 10
        //80 = 8 * 10
        //90 = 9 * 10
        //100 = 10 * 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * number);
        }
    }
}
