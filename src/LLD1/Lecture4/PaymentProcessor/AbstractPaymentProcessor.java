package LLD1.Lecture4.PaymentProcessor;

public abstract class AbstractPaymentProcessor {
    protected String transactionId;
    protected double amount;

    // shared concrete implementation
    public void validate() {
        System.out.println("Validating transaction " + transactionId + " for amount " + amount);
    }

    // Abstract logic - each processor does this differently
    public abstract boolean processPayment();
}
