package _05_class_components;

public class Demo20InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        System.out.println("inner class a = " + inner.a);
        System.out.println("inner class b = " + inner.b);
    }
}

class Outer {
    int x=100;
    class Inner {
        int a = 10;
        int b = 20;
    }
}