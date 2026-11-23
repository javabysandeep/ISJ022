package _06_oops._02_inheritance;

public class Demo6 {
    static class BankAccount {
        String accountHolderName;
        long accountNumber;
        double balance;

        void print() {
            System.out.println(accountHolderName);
        }
    }

    public static void main(String[] args) {

        class SavingsAccount extends BankAccount {

        }
        class CurrentAccount extends BankAccount {
        }
        class LoanAccount extends BankAccount {
        }

        BankAccount b1 = new SavingsAccount();
        BankAccount b2 = new CurrentAccount();
        BankAccount b3 = new LoanAccount();

        b1.accountHolderName = "savings account holder";
        b2.accountHolderName = "current account holder";
        b3.accountHolderName = "loan account holder";

        invoice(b1);
        invoice(b2);
        invoice(b3);

    }

    public static void invoice(BankAccount bankAccount) {
        System.out.println(bankAccount.accountHolderName);
    }

}
