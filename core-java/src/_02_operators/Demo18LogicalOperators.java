package _02_operators;

public class Demo18LogicalOperators {
    public static void main(String[] args) {
        System.out.println(6 % 1 == 0 && 6 % 2 == 0 && 6 % 3 == 0);//true
        System.out.println(11 % 1 == 1 && 11 / 0 == 10);//false
        System.out.println(10 % 2 == 0 || 1 / 0 == 0); //true
        //System.out.println(1 / 0 == 0 || 10 % 2 == 0); //RTE : ArithmeticExceptin : / by zero

        int a = 10;
        int b = 20;
        System.out.println(a > 5 && b > 15); // true

        int x = 10;
        System.out.println(x > 5 || x++ > 20);//true
        System.out.println("x = " + x);//10

        System.out.println(x > 5 && x++ > 20);//false
        System.out.println("x = " + x);//11

        boolean c = true;
        boolean d = false;
        System.out.println(c && !d);//true

        int y = 5;
        System.out.println(y++ > 5 && ++y > 6); //false
        //y = 6
        System.out.println(y++ > 5 || ++y > 6); //true
        System.out.println("y = " + y);//7
    }
}
