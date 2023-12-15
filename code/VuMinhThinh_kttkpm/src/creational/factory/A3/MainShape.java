package creational.factory.A3;

public class MainShape {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();

        Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
        circle.draw();

        Shape triangle = shapeFactory.createShape(ShapeType.TRIANGLE);
        triangle.draw();

        Shape rectangle = shapeFactory.createShape(ShapeType.RECTANGLE);
        rectangle.draw();
    }
}