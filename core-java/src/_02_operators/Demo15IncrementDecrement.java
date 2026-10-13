package _02_operators;

public class Demo15IncrementDecrement {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println(a++ + --a + b++ + ++c + d--); //12

        System.out.println("a = " + a); //1
        System.out.println("b = " + b); //3
        System.out.println("c = " + c); //4
        System.out.println("d = " + d); //3
    }
}
