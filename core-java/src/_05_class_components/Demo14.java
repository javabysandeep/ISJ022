package _05_class_components;

public class Demo14 {
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {

        Demo14 ref1 = new Demo14();
        Demo14 ref2 = new Demo14();
        Demo14 ref3 = new Demo14();
        Demo14 ref4 = new Demo14();
        Demo14 ref5 = new Demo14();
    }
}
