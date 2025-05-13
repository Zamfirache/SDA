package creational.factory;

public class CashPayment implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Plata cu cash");
    }
}
