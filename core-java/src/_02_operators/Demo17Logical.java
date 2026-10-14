package _02_operators;

public class Demo17Logical {
    public static void main(String[] args) {
        System.out.println("**************** Logical AND ******************");
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false

        System.out.println("**************** Logical OR ******************");
        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false || true);//true
        System.out.println(false || false);//false

        System.out.println("**************** Logical NOT ******************");
        System.out.println(!true); //false
        System.out.println(!false); //true
    }
}
