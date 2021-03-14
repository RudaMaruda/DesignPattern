package factory;

public class Line implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Line draw");
    }
}
