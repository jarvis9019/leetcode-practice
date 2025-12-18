package design.patterns.factory.payment;

public class PaymentFactory {
    public void pay(String paymentType, int amount) {
        Payment payment;
        if (paymentType.equalsIgnoreCase("UPI")) {
            payment = new UPIPayment();
        } else if (paymentType.equalsIgnoreCase("CARD")) {
            payment = new CardPayment();
        } else {
            throw new IllegalArgumentException("Invalid payment type");
        }
        payment.pay(amount);
    }



}
