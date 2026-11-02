package _05_class_components;

public class Demo6 {
    public static void main(String[] args) {
        class Student {
            int age;
            String name;


            //zero parameterized constructor
            Student() {
                this.age = 123;
                this.name = "abc";
            }
        }

        //zero parameterized constructor
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

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
    }
}
