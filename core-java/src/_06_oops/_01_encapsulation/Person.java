package _06_oops._01_encapsulation;

public class Person {
    private int id;
    private String name;
    private String address;
    private int age;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        if (age > 0) {

            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }
}
