package decorator;

public abstract class CarDecorator implements VehicleD {
    protected VehicleD decoratedCar;

    public CarDecorator(VehicleD decoratedCar) {
        this.decoratedCar = decoratedCar;
    }
}
