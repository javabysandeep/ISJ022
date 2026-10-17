package _04_control_statements._01_conditional;

public class Demo8 {
    public static void main(String[] args) {
        int offer1 = 1;
        int offer2 = 2;
        int offer3 = 3;
        int offer4 = 4;
        int offer5 = 5;
        int offer6 = 6;
        int offer7 = 7;
        double productPrice = 100;
        double discount = 0;
        String bankName = "SBI";
        if (bankName.equals("SBI")) {
            discount = offer1;
        }
        if (bankName.equals("BOB")) {
            discount = offer2;
        }

        if (bankName.equals("HDFC")) {
            discount = offer3;
        }

        if (bankName.equals("AXIS")) {
            discount = offer4;
        }

        double payableAmount = productPrice - productPrice * discount / 100;
        System.out.println("final payable = " + payableAmount);

    }
}
