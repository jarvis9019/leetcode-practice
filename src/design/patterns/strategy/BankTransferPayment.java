package design.patterns.strategy;

public class BankTransferPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("paid via bank transfer");
    }
}
