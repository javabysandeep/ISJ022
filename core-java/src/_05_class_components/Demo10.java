package _05_class_components;

public class Demo10 {
    int a = 1;
    int b = 2;
    static int c = 3;

    void display() {
        int a = 11;
        int b = 12;
        int c = 13;
        System.out.println("****** local variables ******* ");
        System.out.println("a = " + a);//11
        System.out.println("b = " + b);//12
        System.out.println("c = " + c);//13

        System.out.println("********* static variables ******* ");
        System.out.println("c = " + Demo10.c);

        System.out.println("********** instance variables ******* ");
        System.out.println("a = " + this.a);
        System.out.println("b = " + this.b);

    }

    public static void main(String[] args) {
        Demo10 demo = new Demo10();
        demo.display();
    }
}
