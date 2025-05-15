package structural.decorator.decorators;

import structural.decorator.Coffe;
import structural.decorator.CoffeDecorator;

public class MilkDecorator extends CoffeDecorator {
    public MilkDecorator(Coffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescription() {
       return super.getDescription() + ", milk";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.5;
    }
}
