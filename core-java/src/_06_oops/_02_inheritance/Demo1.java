package _06_oops._02_inheritance;

public class Demo1 {
    public static void main(String[] args) {
        class BankAccount {
            int customerId;
            int accountNumber;
            String accountHolderName;
            double balance;

            void deposit(double amount) {
                balance = balance + amount;
            }

            void withdraw(double amount) {
                balance = balance - amount;
            }

        }
        class SavingsAccount extends BankAccount {
        }
        class CurrentAccount extends BankAccount {
        }

        SavingsAccount savings = new SavingsAccount();
        savings.deposit(1000);
        System.out.println(savings.balance);
    }
}
