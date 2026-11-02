package _05_class_components;

public class Demo7 {
    public static void main(String[] args) {
        class Student {
            int age;
            String name;

            Student() {
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

        //zero parameterized constructor
        Student s1 = new Student();
        Student s2 = new Student(22);
        Student s3 = new Student("Dhruv");
        Student s4 = new Student("Sayali",21);

        System.out.println("Student{" +
                "age=" + s1.age +
                ", name='" + s1.name + '\'' +
                '}');

        System.out.println("Student{" +
                "age=" + s2.age +
                ", name='" + s2.name + '\'' +
                '}');

        System.out.println("Student{" +
                "age=" + s3.age +
                ", name='" + s3.name + '\'' +
                '}');

        System.out.println("Student{" +
                "age=" + s4.age +
                ", name='" + s4.name + '\'' +
                '}');
    }
}
