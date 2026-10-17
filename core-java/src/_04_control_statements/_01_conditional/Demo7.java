package _04_control_statements._01_conditional;

public class Demo7 {
    public static void main(String[] args) {
        //leap year
        /*
         * leap year is year which is divisibly 4.
         * if year is a century then it must be divisible by 400
         * */
        int year = 2026;

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println(year + " is leap year");
        else
            System.out.println(year + " is not leap year");
    }
}
