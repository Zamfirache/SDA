package creational.abstractFactory.luxury;

import creational.abstractFactory.SUV;

public class LuxurySUV implements SUV {
    @Override
    public void drive() {
        System.out.println("Luxury SUV drive");
    }
}
