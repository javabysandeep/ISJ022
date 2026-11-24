package _06_oops._05_final_keyword;

public class Demo4 {
    public static void main(String[] args) {

        final class Product {
            private final int id;
            private final String name;

            public Product(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }
        Product p = new Product(101, "Pizza");


    }
}
