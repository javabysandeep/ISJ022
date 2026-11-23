package _06_oops._04_abstraction;

public class Demo2 {
    public static void main(String[] args) {
        abstract class Payment {
            double amount;

            public void generateReceipt() {
                System.out.println("Receipt generated.");
            }

            public abstract void validate();

            public abstract void processPayment();

        }
        class CreditPayment extends Payment {
            @Override
            public void validate() {
                System.out.println("Credit Payment validated.");
            }

            @Override
            public void processPayment() {

                System.out.println("Credit Payment processing.");
            }
        }
        class DebitCardPayment extends Payment {
            @Override
            public void validate() {
                System.out.println("Debit Card Payment validated.");
            }

            @Override
            public void processPayment() {
                System.out.println("Debit Card Payment processing.");
            }
        }
        class UPIPayment extends Payment {
            @Override
            public void validate() {
                System.out.println("UPI Payment validated.");
            }

            @Override
            public void processPayment() {
                System.out.println("UPI Payment processing.");
            }
        }


    }
}
