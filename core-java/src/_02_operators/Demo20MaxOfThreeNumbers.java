package _02_operators;

public class Demo20MaxOfThreeNumbers {
    public static void main(String[] args) {
        int number1 = 1000;
        int number2 = 200;
        int number3 = 3000;

        System.out.println(number1 > number2 && number1 > number3 ? number1
                : number2 > number1 && number2 > number3 ? number2 : number3
        );

        int a = 10;
        int b = 20;
        System.out.println(a > b ? a : b);//20

    }
}
