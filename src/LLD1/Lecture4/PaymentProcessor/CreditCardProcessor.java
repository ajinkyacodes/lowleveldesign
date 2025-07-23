package LLD1.Lecture4.PaymentProcessor;

public class CreditCardProcessor extends AbstractPaymentProcessor {
    @Override
    public boolean processPayment() {
        // Logic to charge a credit card
        System.out.println("Processing credit card payments");
        return true;
    }
}
