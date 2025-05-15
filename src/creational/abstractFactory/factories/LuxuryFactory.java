package creational.abstractFactory.factories;

import creational.abstractFactory.CarFactory;
import creational.abstractFactory.SUV;
import creational.abstractFactory.Sedan;
import creational.abstractFactory.luxury.LuxurySUV;
import creational.abstractFactory.luxury.LuxurySedan;

public class LuxuryFactory implements CarFactory {
    @Override
    public SUV createSUV() {
        return new LuxurySUV();
    }

    @Override
    public Sedan createSedan() {
        return new LuxurySedan();
    }
}
