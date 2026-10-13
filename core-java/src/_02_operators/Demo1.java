package _02_operators;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("arithmetic operation");

        System.out.println(10 + 20); //30
        System.out.println(100 - 20); //80
        System.out.println(10 * 20); // 200
        System.out.println(101 / 20); //5 = quotient
        System.out.println(101 % 20); //1 = remainder
        System.out.println(10 + 20 * 30 - 30 / 2);//BODMAS --> LR = 595

        System.out.println(1 / 10);//0
        System.out.println(1 % 10);//1
        System.out.println(10 / 1);//10
        System.out.println(10 % 1); //0

        System.out.println(1.0 / 10);//0.1

        System.out.println(1.0 % 10);//1.0
    }
}
