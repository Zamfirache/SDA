package structural.composite;

public class Rectangle implements Shape {
    @Override
    public void draw(String color) {
        System.out.println("Drawing a Rectangle with color " + color);
    }
}
