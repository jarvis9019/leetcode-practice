package design.patterns.factory.payment;

public class TestPayment {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();

        paymentFactory.pay("CARD",100);

        paymentFactory.pay("UPI", 200);
    }
}
