package _02_operators;

public class Demo22Bitwise {
    public static void main(String[] args) {
        System.out.println(4 & 5);//4
        // 4 ----> 1 0 0
        // 5 ----> 1 0 1
        // ---------------
        // 4 <---- 1 0 0

        System.out.println(4 | 5);//5
        // 4 ----> 1 0 0
        // 5 ----> 1 0 1
        // ---------------
        // 5 <---- 1 0 1


        System.out.println(4 ^ 5);//1
        // 4 ----> 1 0 0
        // 5 ----> 1 0 1
        // ---------------
        // 1 <---- 0 0 1


        System.out.println("*********************** Bitwise Negation ****************");
        System.out.println(~4); // 4 + 1 = 5 --> -5
        System.out.println(~-5); // -5 + 1 = -4 ---> 4

    }
}
