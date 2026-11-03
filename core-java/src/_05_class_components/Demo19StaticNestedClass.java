package _05_class_components;

public class Demo19StaticNestedClass {
    public static void main(String[] args) {
        System.out.println("mysql dev credentials");

        System.out.println("dev username = "+ Constants.Mysql.Dev.username);
        System.out.println("dev password = "+ Constants.Mysql.Dev.password);


        System.out.println("mysql qa credentials");
        System.out.println("qa username = "+ Constants.Mysql.QA.username);
        System.out.println("qa password = "+ Constants.Mysql.QA.password);

        System.out.println("mysql prod credentials");
        System.out.println("prod username = "+ Constants.Mysql.Prod.username);
        System.out.println("prod password = "+ Constants.Mysql.Prod.password);
    }
}
