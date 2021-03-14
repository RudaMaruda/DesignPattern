package factory;

public abstract class AbstractFactory {
    public abstract GeometricShape getShape(ShapeType shapeType);
}
