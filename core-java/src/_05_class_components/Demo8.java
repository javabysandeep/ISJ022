package _05_class_components;

public class Demo8 {
    public static void main(String[] args) {
        class Student {
            int age;
            String name;

            Student() {
                this("Prem", 22); // calling parameterized constructor from zero param constructor
//                super();
                //this(10);
                System.out.println("zero parameterized constructor");
            }

            Student(int age) {
                this.age = age;
            }

            Student(String name) {
                this.name = name;
            }

            Student(String name, int age) {
                this.name = name;
                this.age = age;
            }


        }

        Student s4 = new Student();
        System.out.println("Student{" +
                "age=" + s4.age +
                ", name='" + s4.name + '\'' +
                '}');
    }
}
