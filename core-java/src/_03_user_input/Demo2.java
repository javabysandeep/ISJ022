package _03_user_input;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter byte type value");
        byte byteValue = sc.nextByte();

        System.out.println("Enter short type value");
        short shortValue = sc.nextShort();

        System.out.println("Enter int type value");
        int intValue = sc.nextInt();

        System.out.println("Enter long type value");
        long longValue = sc.nextLong();

        System.out.println("Enter float type value");
        float floatValue = sc.nextFloat();

        System.out.println("Enter double type value");
        double doubleValue = sc.nextDouble();

        System.out.println("Enter boolean type value");
        boolean booleanValue = sc.nextBoolean();

        System.out.println("Enter a string type value");
        String stringValue = sc.next();//one token

        System.out.println("Enter a char type value");
        char charValue = sc.next().charAt(0);// single character

        System.out.println("Enter String type value");
        String stringTypeValue = sc.nextLine();


        System.out.println("byteValue = " + byteValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("booleanValue = " + booleanValue);
        System.out.println("String = " + stringValue);
        System.out.println("Char = " + charValue);
        System.out.println("String = " + stringTypeValue);
    }
}
