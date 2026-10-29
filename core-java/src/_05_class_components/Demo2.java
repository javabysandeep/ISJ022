package _05_class_components;

public class Demo2 {
    public static void main(String[] args) {
        int a = 100; //local to main
        int b = 200; //local to main
        int p = 100;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int result = add(100, 200);//method call
        System.out.println("result = " + result);
    }

    //method definition
    public static int add(int a, int b) {
        //local variables = int a, int b // local to add method
        //System.out.println(p);//CTE
        return a + b;
    }
}
