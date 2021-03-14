package factory;

public class Trapezoid implements GeometricShapeArea{
    @Override
    public void draw() {
        System.out.println("Trapezoid draw");

    }
    @Override
    public void getArea(){
        System.out.println("The area for trapezoid is: 320 cm^2");
    }
    @Override
    public void getPerimeter(){
        System.out.println("The perimeter for trapezoid is: 880cm");
    }

}
