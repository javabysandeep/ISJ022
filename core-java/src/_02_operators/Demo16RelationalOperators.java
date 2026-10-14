package _02_operators;

public class Demo16RelationalOperators {
    public static void main(String[] args) {
        System.out.println(10 > 5);//true
        System.out.println(10 < 5);//false
        System.out.println(10 <= 5);//false
        // System.out.println(10 <= true);//CTE
        // System.out.println(10 > true);//CTE
        System.out.println(10 >= 10);//true
        //System.out.println(true < true);//CTE
        // System.out.println(1==true);//CTE

        System.out.println(10 % 3 > 5);//false
        System.out.println(2026 % 4 == 0);//2==0 >> false
        System.out.println(2026 % 400 == 0);//false
        System.out.println(2026 % 100 != 0);//true
        System.out.println(1 % 10 > 10);// 1 > 10 --> false
        System.out.println(1 / 10 > 10);// 0 > 10 --> false

        System.out.println(100 % 2 == 0);//true --> even
        System.out.println(101 % 2 == 0);//false --> odd

        System.out.println(10 > 3 == true);//true == true --> true
        System.out.println(19 % 2 == 1 == (23 % 3 == 2));//true

        System.out.println('A' == 65);//true
        //System.out.println('A' == true);//CTE
        //System.out.println('A'=="A");//CTE
        System.out.println('A' == 'A'); //true
        System.out.println("A" == "65");//false
        //System.out.println('A' == "65");//CTE

    }
}
