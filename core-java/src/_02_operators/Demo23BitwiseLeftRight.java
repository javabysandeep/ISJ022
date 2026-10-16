package _02_operators;

public class Demo23BitwiseLeftRight {
    public static void main(String[] args) {
        System.out.println("************************ BITWISE LEFT Shift << ****************");
        System.out.println(4 << 1);// 4 * 2^1 ==> 8
        System.out.println(4 << 2);// 4 * 2^2 ==> 16
        System.out.println(4 << 3);// 4 * 2^3 ==> 32
        System.out.println(4 << 4);// 4 * 2^4 ==> 64

        // 4 -------------------> 0 0 0 0 0 1 0 0
        // shift by one places -> 0 0 0 0 1 0 0 0
        // shift by two places -> 0 0 0 1 0 0 0 0
        //shift by three places-> 0 0 1 0 0 0 0 0
        // shift by four places-> 0 1 0 0 0 0 0 0


        System.out.println("************************ BITWISE RIGHT Shift << ****************");
        System.out.println(4 >> 1);// 4 / 2^1 ==> 2
        System.out.println(4 >> 2);// 4 / 2^2 ==> 1
        System.out.println(4 >> 3);// 4 / 2^3 ==> 0
        System.out.println(4 >> 4);// 4 / 2^4 ==> 0

        // 4 -------------------> 0 0 0 0 0 1 0 0
        // shift by one places -> 0 0 0 0 0 0 1 0
        // shift by two places -> 0 0 0 0 0 0 0 1
        //shift by three places-> 0 0 0 0 0 0 0 0
        // shift by four places-> 0 0 0 0 0 0 0 0

        int number = -8; // 11111111 11111111 11111111 11111000
        System.out.println(number >> 1); // -4 -----------→ 11111111 11111111 11111111 11111100
        System.out.println(number >>> 1); // 2147483644 --> 01111111 11111111 11111111 11111100

    }
}
