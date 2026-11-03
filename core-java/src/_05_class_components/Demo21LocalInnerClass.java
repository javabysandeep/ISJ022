package _05_class_components;

public class Demo21LocalInnerClass {
    public static void main(String[] args) {

        class Product {
            int id;
            String name;
        }
        Product p = new Product();
        p.id = 100;
        p.name = "mouse";
        System.out.println(p.id + "\t" + p.name);

    }
}
