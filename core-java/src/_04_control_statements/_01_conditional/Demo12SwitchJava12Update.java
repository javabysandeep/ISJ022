package _04_control_statements._01_conditional;

public class Demo12SwitchJava12Update {
    public static void main(String[] args) {
        int number = 5;

        //switch input : byte, short, int, char, String, enum, wrapper classes of [Byte, Short, Integer, Character]

        switch (number) {
            case 1 -> System.out.println("Jan");
            case 2 -> System.out.println("Feb");
            case 3 -> System.out.println("Mar");
            case 4 -> System.out.println("Apr");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("Jun");
            case 7 -> System.out.println("Jul");
            case 8 -> System.out.println("Aug");
            case 9 -> System.out.println("Sep");
            case 10 -> System.out.println("Oct");
            case 11 -> System.out.println("Nov");
            case 12 -> System.out.println("Dec");
            default -> System.out.println("Invalid input");
        }

    }
}
