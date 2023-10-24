package AbstractFactoryDesignPattern.VehiclesExample.Factories;

import AbstractFactoryDesignPattern.VehiclesExample.Vehicles.*;

public interface VehicleFactory {

    public void getListOfVehicles();

    public Vehicle getVehicle(String vehicleString);
    
}
