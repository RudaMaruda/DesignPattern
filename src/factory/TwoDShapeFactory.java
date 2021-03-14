package factory;

public class TwoDShapeFactory extends AbstractFactory {
    @Override
    public GeometricShape getShape(ShapeType shapeType) {
        if(ShapeType.CIRCLE==shapeType){
            return new Circle();
        }else if(ShapeType.LINE==shapeType){
            return new Line();
        } else if(ShapeType.TRIANGLE==shapeType){
            return new Triangle();
        } else if(ShapeType.TRAPEZOID==shapeType){
            return new Trapezoid();
        }
        return null;
    }
}
