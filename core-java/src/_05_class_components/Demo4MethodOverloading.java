package _05_class_components;

public class Demo4MethodOverloading {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(100, 200));
        System.out.println(add(100, 200, 300));
        System.out.println(add(100, 200, 300, 400));
        System.out.println(add("abc", "abc"));
        System.out.println(add(10.5, 20.5));
    }
}
