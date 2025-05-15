package creational.abstractFactory.factories;

import creational.abstractFactory.CarFactory;
import creational.abstractFactory.SUV;
import creational.abstractFactory.Sedan;
import creational.abstractFactory.economy.EconomySUV;
import creational.abstractFactory.economy.EconomySedan;

public class EconomyFactory implements CarFactory {
    @Override
    public SUV createSUV() {
        return new EconomySUV(); // copil Economy a lui SUV
    }

    @Override
    public Sedan createSedan() {
        return new EconomySedan();  //copil economy a lui Sedan
    }
}
