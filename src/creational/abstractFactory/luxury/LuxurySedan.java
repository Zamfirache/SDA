package creational.abstractFactory.luxury;

import creational.abstractFactory.Sedan;

public class LuxurySedan implements Sedan {
    @Override
    public void drive() {
        System.out.println("Luxury Sedan drive");
    }
}
