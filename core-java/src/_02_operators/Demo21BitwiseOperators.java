package _02_operators;

public class Demo21BitwiseOperators {
    public static void main(String[] args) {
        System.out.println("**************** BITWISE AND & **************");
        System.out.println(true & true); // true
        System.out.println(false & true); //false
        System.out.println(false & true); //false
        System.out.println(false & false); // false

        System.out.println("******************* BITWISE OR  | ****************");
        System.out.println(true | true); //true
        System.out.println(true | false); //true
        System.out.println(false | true); //true
        System.out.println(false | false); //false

        System.out.println("******************* BITWISE XOR ********************");
        System.out.println(true ^ true);//false
        System.out.println(true ^ false); //true
        System.out.println(false ^ true);//true
        System.out.println(false ^ false);//false


    }
}
