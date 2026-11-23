package _05_class_components.p2;

import _05_class_components.p1.A;

public class B extends A {
    public static void main(String[] args) {
        // System.out.println("x = " + A.x);//private
        // System.out.println("y = " + A.y); //default
         System.out.println("z = " + A.z); //protected
        System.out.println("w = " + A.w); //public
    }
}
