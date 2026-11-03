package _05_class_components;

public class Demo12 {
    int a;
    int b;

    public void setter(int a, int b) {
        //assigning local variable value to instance variable
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Demo12 d = new Demo12();
        d.setter(10, 20);
        System.out.println("d.a = " + d.a);
        System.out.println("d.b = " + d.b);
    }
}
