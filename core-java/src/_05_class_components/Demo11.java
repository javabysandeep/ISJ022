package _05_class_components;

public class Demo11 {
    int a = 1;
    int b = 2;
    static int c = 3;

    void display() {

        System.out.println("********* static variables ******* ");
        System.out.println("c = " + c);

        System.out.println("********** instance variables ******* ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static void main(String[] args) {
        Demo11 demo = new Demo11();
        demo.display();
    }
}
