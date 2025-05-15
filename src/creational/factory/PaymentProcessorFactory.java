package creational.factory;

public class PaymentProcessorFactory {

    public static PaymentProcessor getPaymentProcessor(String processorType) { // metoda asta returneaza interfata(PARINTELE)!!!

        return switch (processorType)   // POLIMORFISM!!!!!!
        {
            case "card" -> new CreditCardPayment();
            case "cash" -> new CashPayment();
            default -> throw new IllegalStateException("Nu exista aceasta posibilitate");
        };

    }

}
