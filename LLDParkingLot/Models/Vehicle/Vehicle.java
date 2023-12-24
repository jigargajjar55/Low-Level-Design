package LLDParkingLot.Models.Vehicle;

public class Vehicle {
    String registrationNumber;
    public VehicleType vehicleType;
    String color;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

   

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }

    public Vehicle(String registrationNumber, VehicleType vehicleType, String color) {
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
        this.color = color;
    }
}
