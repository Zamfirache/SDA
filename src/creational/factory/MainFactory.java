package creational.factory;

public class MainFactory {

    public static void main(String[] args) {

        String type = "cash";
        PaymentProcessorFactory.getPaymentProcessor(type).processPayment();
    }
}
