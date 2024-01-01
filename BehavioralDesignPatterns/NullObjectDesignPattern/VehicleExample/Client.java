package NullObjectDesignPattern.VehicleExample;

public class Client {
    
    public static void main(String[] args) {
        
        Vehicle vehicle = VehicleFactory.getVehicle("Truck");

        System.out.println(vehicle.getSeatCapacity());
        System.out.println(vehicle.getFuelCapacity());
    }
}
