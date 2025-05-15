package structural.decorator;

public abstract class CoffeDecorator implements Coffe {

    public Coffe coffe;


    public CoffeDecorator(Coffe coffe) {
        this.coffe = coffe;
    }


    @Override
    public String getDescription() {
        return coffe.getDescription();
    }

    @Override
    public double getPrice() {
        return coffe.getPrice();
    }


    public void setCoffe(Coffe coffe) {
        this.coffe = coffe;
    }

    public Coffe getCoffe() {
        return coffe;
    }
}
