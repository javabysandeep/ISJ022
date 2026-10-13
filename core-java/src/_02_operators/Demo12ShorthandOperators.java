package _02_operators;

public class Demo12ShorthandOperators {
    public static void main(String[] args) {
        int number1 = 100;
        //number1 = number1 + 100;
        number1 += 100;

        int number2 = 200;
        //number2 = number2 - 100;
        number2 -= 100;

        int number3 = 200;
        //number3 = number3 * 2;
        number3 *= 2;

        int number4 = 200;
        // number4 = number4 / 100;
        number4 /= 100;

        int number5 = 105;
        //number5 = number5 % 10;
        number5 %= 10;

        System.out.println("number1 = " + number1); //200
        System.out.println("number2 = " + number2); //100
        System.out.println("number3 = " + number3); //400
        System.out.println("number4 = " + number4); //2
        System.out.println("number5 = " + number5); //5


        int number6 = 10;
        number6 += 10 + 10 * 20;
        System.out.println("number6 = " + number6);//220
    }
}
