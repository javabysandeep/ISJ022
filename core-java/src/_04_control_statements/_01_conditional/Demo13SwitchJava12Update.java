package _04_control_statements._01_conditional;

public class Demo13SwitchJava12Update {
    public static void main(String[] args) {
        int number = 5;

        String month = switch (number) {
            case 1 -> "Jan";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "Apr";
            case 5 -> "May";
            case 6 -> "Jun";
            case 7 -> "Jul";
            case 8 -> "Aug";
            case 9 -> "Sep";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            default -> "Invalid input";
        };
        System.out.println("month = " + month);

    }
}
