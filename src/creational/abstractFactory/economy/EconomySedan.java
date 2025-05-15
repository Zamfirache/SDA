package creational.abstractFactory.economy;

import creational.abstractFactory.Sedan;

public class EconomySedan implements Sedan {
    @Override
    public void drive() {
        System.out.println("Economy Sedan drive");
    }
}
