package _06_oops._06_anonymous;

public class Demo1 {
    public static void main(String[] args) {
        class Parent {
            void show() {
                System.out.println("Parent ::show");
            }
        }

        // we are defining anonymous class that extends Parent class
        // we are creating object of anonymous subclass
        // we are not creating object of parent class
        // parentClass reference = child class object
        Parent p = new Parent() {
            void show() {
                System.out.println("Child ::show");
            }
        };
        p.show();


    }
}
