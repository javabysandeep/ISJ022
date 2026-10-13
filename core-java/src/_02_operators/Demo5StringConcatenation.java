package _02_operators;

public class Demo5StringConcatenation {
    public static void main(String[] args) {
        // mathematical addition --->  +
        // String concatenation  --->+
        // concat : joining the String
        //string : group of characters enclosed in double quotes
        System.out.println(10 + 20); //30 => mathematical addition
        System.out.println("10" + 20); //1020 => string concatenation
        System.out.println("10" + 20 + 30); //102030 => string concatenation
        System.out.println(10 + 20 + "30"); //3030

        System.out.println('A' + 'A'); //130 --> mathematical addition
        System.out.println('5' + 'A'); //130 --> mathematical addition
        // A= 65 , 5 = 53
        System.out.println("A" + "A"); //AA
        System.out.println('5' + 5); // 58
        System.out.println('5' + "5"); // 55

        System.out.println('A' + "A" + 'A');//AAA
        System.out.println('A' + "Good morning");

    }
}
