package decorator;



public class CarD implements VehicleD {
    @Override
    public void drive() {
        System.out.println("Car drive");
    }

    @Override
    public String description() {
        return "Car is beautiful";
    }
}
