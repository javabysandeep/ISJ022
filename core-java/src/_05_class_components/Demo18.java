package _05_class_components;

public class Demo18 {
    int a; //  static nested class cannot access it
    static int b; //  static nested class can access it
    //static nested class
    static class A{}

    //non-static nested class or inner class
    class B{}

    public static void main(String[] args) {
        //local inner class
        class C{}
    }
}
