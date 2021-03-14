package factory;

public class Triangle implements GeometricShapeArea{
    @Override
    public void draw() {
        System.out.println("Triangle draw");

    }
    @Override
    public void getArea(){
        System.out.println("The area for triangle is: 120 cm^2");
    }
    @Override
    public void getPerimeter(){
        System.out.println("The perimeter for triangle is: 150cm");
    }
}
