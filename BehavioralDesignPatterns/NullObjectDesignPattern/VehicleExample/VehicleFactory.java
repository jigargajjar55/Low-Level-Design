package NullObjectDesignPattern.VehicleExample;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicle) {

        switch (vehicle) {
            case "Car":

                return new Car();

            case "Bike":

                return new Bike();

            default:
                return new NullObject();
        }
    }
}
