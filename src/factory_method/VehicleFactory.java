package factory_method;

public class VehicleFactory {

    public static Vehicle getVehicle(VehicleType vehicleType){
        switch (vehicleType){
            case CAR:
                return new Car();
            case MOTOCYCLE:
                return new Motocycle();
            case QUAD:
                return new Quad();
            default:
                return null;

        }
    }

}
