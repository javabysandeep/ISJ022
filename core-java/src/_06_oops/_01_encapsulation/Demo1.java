package _06_oops._01_encapsulation;

public class Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        //s1 ---> object { id = 0 , name= null, address = null }
        //s1 is a local reference variable.
        System.out.println(s1.id + " " + s1.name + " " + s1.address);

        //change the values of instance variables : id, name, address
        s1.id = 101;
        s1.name = "prem";
        s1.address = "Pune";

        System.out.println(s1.id + " " + s1.name + " " + s1.address);

    }
}
