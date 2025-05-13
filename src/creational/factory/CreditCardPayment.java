package creational.factory;

public class CreditCardPayment implements PaymentProcessor{
    @Override
    public void processPayment() {
        System.out.println("Plata cuc cardul");
    }
}
