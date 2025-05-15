package creational.prototype;

public class MainPrototype {
    public static void main(String[] args) {

        Car dacia = new Car("Dacia Duster");
        //Car clona = new Car("Clona Duster");
        Car clona = dacia.clone();
    }
}
