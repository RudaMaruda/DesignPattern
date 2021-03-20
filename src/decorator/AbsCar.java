package decorator;

public class AbsCar extends CarDecorator{
    public AbsCar(VehicleD decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void drive() {
        System.out.println("Car with ABS is driving");
    }

    @Override
    public String description() {
        return decoratedCar.description()+" car with ABS";
    }
}
