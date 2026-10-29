package _04_control_statements._02_looping._04_enhanced;

public class Demo1 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int temp : array) {
            System.out.println(temp);
        }

        System.out.println("traditional loop");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

        String[] strings = {"a", "b", "c", "d", "e", "f", "g"};

    }
}
