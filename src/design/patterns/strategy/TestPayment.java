package design.patterns.strategy;

public class TestPayment {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new BankTransferPayment());
        paymentContext.pay(20.00);

        //to change payment strategy
        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.pay(32.19);
    }
}
