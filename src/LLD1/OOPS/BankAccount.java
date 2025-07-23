package LLD1.OOPS;

public class BankAccount {
    double balance;
    String OwnerName;

    void addDeposit(double newAmount) {
        balance = balance + newAmount;
        System.out.println("Deposited Amount: " + newAmount);
    }

    void withdraw(double withdrawAmount) {
        if (withdrawAmount < balance) {
            balance = balance - withdrawAmount;
            System.out.println("Withdraw Successful : " + withdrawAmount);
        } else {
            System.out.println("Low Balance");
        }
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
    /*
        Create a new Java file LLD_Lecture1.BankAccount.java and define a simple LLD_Lecture1.BankAccount class to
        represent a Bank Account.

        Add two fields: balance(double) and OwnerName(String)

        Add deposit and withdraw methods with basic validation.
        (e.g. Ensure withdrawals don't result in -ve balances)

     */

        BankAccount bank = new BankAccount();
        bank.OwnerName ="Ajinkya";
        bank.balance =1000;

        bank.addDeposit(120);
        bank.showBalance();
        bank.withdraw(1500);
        bank.showBalance();
    }
}
