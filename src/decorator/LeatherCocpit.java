package decorator;

public class LeatherCocpit extends CarDecorator{

    public LeatherCocpit(VehicleD decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void drive() {
        System.out.println("Car with leather cocpit drive");
    }

    @Override
    public String description() {
        return decoratedCar.description()+" with leather cocpit";
    }
}
