package creational.prototype;

public class Car implements Cloneable { // interfata Marker Cloneable!!! , adica o interfata goala!

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public Car clone() {

        try {
            Car car = (Car) super.clone(); // cast explicit
            return car;
        }
        catch (CloneNotSupportedException e) {
            throw new RuntimeException("Exceptie");
        }

    }
}
