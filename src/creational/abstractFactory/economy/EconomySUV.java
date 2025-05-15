package creational.abstractFactory.economy;

import creational.abstractFactory.SUV;

public class EconomySUV implements SUV {
    @Override
    public void drive() {
        System.out.println("Economy SUV drive");
    }
}
