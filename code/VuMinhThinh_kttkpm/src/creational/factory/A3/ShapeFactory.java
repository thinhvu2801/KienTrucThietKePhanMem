package creational.factory.A3;

public class ShapeFactory {
    private static final ShapeFactory instance = new ShapeFactory();

    private ShapeFactory() {
        // Private constructor to prevent instantiation.
    }

    public static ShapeFactory getInstance() {
        return instance;
    }

    public Shape createShape(ShapeType type) {
        switch (type) {
            case CIRCLE:
                return new Circle();
            case TRIANGLE:
                return new Triangle();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Unsupported shape type: " + type);
        }
    }
}