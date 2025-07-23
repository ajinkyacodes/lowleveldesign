package LLD1.OOPS;

public class Bank {
    // write the code of bank account class here
    String accountNumber;
    int balance;
    double roi;

    double getSimpleInterest(int years) {
        // Formula SI = (P × R × T) / 100
        /*
            P	=	initial principal balance
            r	=	annual interest rate
            t	=	time (in years)
        */
        return (this.balance * this.roi * years) / 100;
    }

    double getBalanceWithInterest(int years) {
        return this.balance + this.getSimpleInterest(years);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.accountNumber = "123456789";
        bank.balance = 10000;
        bank.roi = 7.8;

        System.out.println("Simple Interest for 5 years = " + bank.getSimpleInterest(5)); // 3900.0
        System.out.println("Balance with Interest in 5 Years = " + bank.getBalanceWithInterest(5)); // 13900.0
    }
}
