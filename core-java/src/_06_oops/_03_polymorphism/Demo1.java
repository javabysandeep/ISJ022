package _06_oops._03_polymorphism;

public class Demo1 {

    // JVM calls method with the signature   public static void main(String[] args)
    public static void main(String[] args) {
        System.out.println("main method 01");
    }

    public static void main(String args) {
        System.out.println("main method 02");
    }

    public static int main() {
        System.out.println("main method 03");
        return 0;
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int add(int a, int b, int c) {
        return a + b + c;
    }

    private static double add(double a, double b) {
        return a + b;
    }


}
