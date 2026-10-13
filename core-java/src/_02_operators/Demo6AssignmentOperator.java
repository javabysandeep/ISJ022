package _02_operators;

public class Demo6AssignmentOperator {
    public static void main(String[] args) {
        // = : assignment operator
        // == : equality operator

        int variable1 = 100;
        int variable2 = 10 + 30;
        double variable3 = Math.random() * 10;
        double variable4 = variable3;

        System.out.println("variable1 = " + variable1);
        System.out.println("variable2 = " + variable2);
        System.out.println("variable3 = " + variable3);
        System.out.println("variable4 = " + variable4);

        //System.out.println(10=10);//CTE


        int number1 = 100;
        number1 = number1 + 100;
        System.out.println("number1 = " + number1); //200

        int number2 = 200;
        number2 = number2 - 100;
        System.out.println("number2 = " + number2); //100

        int number3 = 200;
        number3 = number3 * 2;
        System.out.println("number3 = " + number3); //400

        int number4 = 200;
        number4 = number4 / 100;
        System.out.println("number4 = " + number4); //2

        int number5 = 105;
        number5 = number5 % 10;
        System.out.println("number5 = " + number5); //5


    }
}
