package _02_operators;

public class Demo4 {
    public static void main(String[] args) {
        // division / --> quotient
        // division % --> remainder
        System.out.println(100 / 100); //1
        System.out.println(99 / 100); //0
        System.out.println(98 / 100); //0
        System.out.println(97 / 100); //0
        System.out.println(51 / 100); //0
        System.out.println(1 / 100); //0
        System.out.println(0 / 100); //0
        // numerator < denominator ==> quotient = 0 and remainder = numerator
        System.out.println("remainder operator or modulo");
        System.out.println(100 % 100); //0
        System.out.println(99 % 100); //99
        System.out.println(98 % 100); //98
        System.out.println(97 % 100); //97
        System.out.println(51 % 100); //51
        System.out.println(1 % 100); //1
        System.out.println(0 % 100); //0
    }
}
