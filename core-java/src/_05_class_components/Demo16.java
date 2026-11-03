package _05_class_components;

public class Demo16 {
    static {
        System.out.println("static block");
    }

    Demo16() {
        //01. call to super class constructor
        //super();
        this(10);
        //02. call to the same class instance block
        System.out.println("zero param Constructor");
    }

    Demo16(int i){
        //01. super class constructor call
        //02. same class instance block
        System.out.println("param constructor");
    }

    {
        System.out.println("instance block");
    }

    public static void main(String[] args) {
        Demo16 d = new Demo16();
    }
}
