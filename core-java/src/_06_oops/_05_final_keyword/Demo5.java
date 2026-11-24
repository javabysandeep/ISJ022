package _06_oops._05_final_keyword;

public class Demo5 {
    public static void main(String[] args) {
        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();
        Student s3 = Student.getInstance();
    }
}

class Student {
    private static final Student instance = new Student();

    private Student() {
    }

    public static synchronized Student getInstance() {
        return instance;
    }
}