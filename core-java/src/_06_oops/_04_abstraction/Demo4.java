package _06_oops._04_abstraction;

public class Demo4 {
    public static void main(String[] args) {
        interface I1 {
            public static final int x = 100;
            public static void m1(){
                System.out.println("interface : static method");
            }
        }
        System.out.println("static variable of an interface = "+I1.x);
        I1.m1();
    }
}
