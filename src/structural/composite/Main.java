package structural.composite;

public class Main {
    public static void main(String[] args) {

      Shape circle = new Circle();  //POLIMORFISM!!!!
      Shape triangle = new Triangle();
      Shape rectangle = new Rectangle();

      DrawingShapes drawingShape = new DrawingShapes();

      drawingShape.addShape(circle);
      drawingShape.addShape(triangle);
      drawingShape.addShape(rectangle);


      drawingShape.draw("red");

    }
}
