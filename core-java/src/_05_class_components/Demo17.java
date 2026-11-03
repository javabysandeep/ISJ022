package _05_class_components;

public class Demo17 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}

class Parent {
    static {
        System.out.println("Parent :: static block");
    }

    {
        System.out.println("Parent :: instance block");
    }

    Parent() {
        //01. super()
        //02. instance block
        System.out.println("Parent :: constructor");
    }
}

class Child extends Parent {
    static {
        System.out.println("Child :: static block");
    }

    {
        System.out.println("Child :: instance block");
    }

    Child() {
        //01. super()
        //02. instance block
        System.out.println("Child :: constructor");
    }
}
