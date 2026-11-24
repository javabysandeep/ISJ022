package _06_oops._05_final_keyword;

public class Demo3 {
    public static void main(String[] args) {
        Product p = new Product();
        //p.id = 101;
        //p.name = "Mobile";
        // System.out.println(p.id + "\t" + p.name);//0 null
        p.setId(201);
        p.setName("Pizza");
        System.out.println(p.getId() + " " + p.getName());
    }
}

class Product {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}