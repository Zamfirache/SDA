package structural.decorator.decorators;

import structural.decorator.Coffe;
import structural.decorator.CoffeDecorator;

public class CreamDecorator extends CoffeDecorator {
    public CreamDecorator(Coffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", cream";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5;
    }
}
