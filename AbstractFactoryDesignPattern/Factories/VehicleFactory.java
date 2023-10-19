package AbstractFactoryDesignPattern.Factories;

import AbstractFactoryDesignPattern.Vehicles.*;

public interface VehicleFactory {

    public void getListOfVehicles();

    public Vehicle getVehicle(String vehicleString);
    
}
