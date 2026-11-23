package _06_oops._02_inheritance;

public class Demo3 {
    public static void main(String[] args) {
        class A {
            int x = 1;
            int y = 2;

        }
        class B extends A {
            int x = 3;
            int y = 4;

            void show(int x, int y) {
                System.out.println("local variables : x = " + x + ", y = " + y);
                System.out.println("class B instance variables : x = " + this.x + ", y = " + this.y);
                System.out.println("class A parent class instance variables : x = " + super.x + ", y = " + super.y);
            }
        }

        B b = new B();
        b.show(10, 20);
    }
}
