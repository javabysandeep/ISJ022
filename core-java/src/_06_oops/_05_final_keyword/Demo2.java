package _06_oops._05_final_keyword;

public class Demo2 {
    public static void main(String[] args) {
        //03. final variables cannot be reinitialized
        final int variable = 100;
//        variable = 200;//CTE


        class Student {
            //            final int id = 101;
//            final String name = "John";
            final int id;
            final String name;
            final static String CollegeName = "Pune University";

            Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

        }
        Student s1 = new Student(1, "abc");
        Student s2 = new Student(2, "xyz");

        // s1.id = 1000; //CTE
        // s1.name = "zbbbbb"; //CTE

        System.out.println(s1.id + "\t" + s1.name);
        System.out.println(s2.id + "\t" + s2.name);

    }
}
