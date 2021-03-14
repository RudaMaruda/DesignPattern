package factory;

public class TreeDShapeFactory extends AbstractFactory{
    @Override
    public GeometricShape getShape(ShapeType shapeType) {
        if(ShapeType.SPHERE==shapeType){
            return new Sphere();
        }
        return null;
    }
}
