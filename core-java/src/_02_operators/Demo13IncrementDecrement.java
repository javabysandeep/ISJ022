package _02_operators;

public class Demo13IncrementDecrement {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a;
        System.out.println("a = " + a);//6
        System.out.println("b = " + b);//6

        int c = 5;
        int d = c++;
        System.out.println("c = " + c);//6
        System.out.println("d = " + d);//5
    }
}
