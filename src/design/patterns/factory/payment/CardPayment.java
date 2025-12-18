package design.patterns.factory.payment;

public class CardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Card Payment");
    }
}
