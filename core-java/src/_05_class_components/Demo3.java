package _05_class_components;

public class Demo3 {
    public static void main(String[] args) {
        Student s1 = new Student(); //  s1 ---> {id = 0, name = null, age=0}
        Student s2 = new Student(); //  s2 ---> {id = 0, name = null, age=0}
        Student s3 = new Student(); //  s3 ---> {id = 0, name = null, age=0}

        System.out.println("s1 student details");
        System.out.println("id = " + s1.id + "\t" + "name = " + s1.name + "\t" + "age = " + s1.age);

        System.out.println("s2 student details");
        System.out.println("id = " + s2.id + "\t" + "name = " + s2.name + "\t" + "age = " + s2.age);

        System.out.println("s3 student details");
        System.out.println("id = " + s3.id + "\t" + "name = " + s3.name + "\t" + "age = " + s3.age);

        System.out.println("*************************************************************");
        System.out.println("College name = " + Student.collegeName);
    }
}
