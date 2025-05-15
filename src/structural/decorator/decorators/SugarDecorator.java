package structural.decorator.decorators;

import structural.decorator.Coffe;
import structural.decorator.CoffeDecorator;

public class SugarDecorator extends CoffeDecorator {
    public SugarDecorator(Coffe coffe) {
        super(coffe);
    }


    @Override
    public String getDescription() {
        return super.getDescription() + ", sugar";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.78;
    }


}
