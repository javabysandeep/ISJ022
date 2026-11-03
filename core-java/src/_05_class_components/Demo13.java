package _05_class_components;

public class Demo13 {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;

        System.out.println("addition = " + add(number1, number2)); //3000

        System.out.println("number1 = " + number1); //100
        System.out.println("number2 = " + number2); //200
    }

    public static int add(int number1, int number2) {
        number1 = 1000;
        number2 = 2000;
        return number1 + number2;
    }
}
