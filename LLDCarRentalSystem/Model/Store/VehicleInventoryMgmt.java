package LLDCarRentalSystem.Model.Store;

import java.util.List;
import java.util.Map;

import LLDCarRentalSystem.Model.Vehicle.Vehicle;
import LLDCarRentalSystem.Model.Vehicle.VehicleType;

public class VehicleInventoryMgmt {

   List<Vehicle> vehicles;

    public VehicleInventoryMgmt(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
       
       

         //filtering
         return vehicles;
    }

    public void setVehicles(VehicleType vehicleType, List<Vehicle> vehiclesList) {
        this.vehicles = vehiclesList;
    }

}
