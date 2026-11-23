package _06_oops._01_encapsulation;

public class Demo2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(
                p1.getId() + " "
                        + " " + p1.getName()
                        + " " + p1.getAddress()
                        + " " + p1.getAge()
        );

        //change the values of instance variables : id, name, address

        p1.setId(101);
        p1.setName("prem");
        p1.setAddress("Pune");
        //p1.age = -100;
        p1.setAge(100);
        System.out.println(
                p1.getId() + " "
                        + " " + p1.getName()
                        + " " + p1.getAddress()
                        + " " + p1.getAge()
        );


    }
}
