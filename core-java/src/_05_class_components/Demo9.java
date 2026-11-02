package _05_class_components;

public class Demo9 {
    public static void main(String[] args) {
        class Student {
            int age;
            String name;

            Student() {

            }
            Student(String name, int age) {
                this.name = name;
                this.age = age;
            }
            Student(Student student){
                this.age = student.age;
                this.name = student.name;
            }


        }

        Student s1 = new Student("Prem",21);

        Student s2 = new Student(s1);

        System.out.println("Student{" +
                "age=" + s1.age +
                ", name='" + s1.name + '\'' +
                '}');

        System.out.println("Student{" +
                "age=" + s2.age +
                ", name='" + s2.name + '\'' +
                '}');
    }
}
