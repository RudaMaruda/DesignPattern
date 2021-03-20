package factory_method;

public class Car implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Car drive");
    }
}
