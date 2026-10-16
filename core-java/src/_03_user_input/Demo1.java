package _03_user_input;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        // how do i read a number/string from a keyboard
        Scanner sc = new Scanner(System.in); //  object creation

        System.out.println("Enter number1");
        int number1 = sc.nextInt();

        System.out.println("Enter number2");
        int number2 = sc.nextInt();

        System.out.println("addition of two numbers = " + number1 + number2);//addition of two numbers = 100200
        System.out.println("addition of two numbers = " + (number1 + number2));//addition of two numbers = 300


    }
}
