package structural.decorator;

public class SimpleCoffe implements Coffe{
    @Override
    public String getDescription() {
        return "Simple coffe";
    }

    @Override
    public double getPrice() {
        return 10.5;
    }
}
