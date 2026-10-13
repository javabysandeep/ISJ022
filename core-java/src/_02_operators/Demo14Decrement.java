package _02_operators;

public class Demo14Decrement {
    public static void main(String[] args) {
        int a = 5;
        int b = --a;
        System.out.println("a = " + a);//4
        System.out.println("b = " + b);//4

        int c = 5;
        int d = c--;
        System.out.println("c = " + c);//4
        System.out.println("d = " + d);//5
    }
}
