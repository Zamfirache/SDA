package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DrawingShapes implements Shape{ // clasa de compunere!!!


    private List<Shape> shapes = new ArrayList<Shape>(); // mare atentie la POLIMORFISM!


    @Override
    public void draw(String color) {

        for(Shape shape : shapes) {
            shape.draw(color);
        }

    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        this.shapes.remove(shape);
    }

    public void clearShapes() {
        this.shapes.clear(); // golim toata lista de copii!!!
    }
}
