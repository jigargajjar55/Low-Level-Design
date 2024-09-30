package LLDCarRentalSystem.Model.Store;

import java.util.ArrayList;
import java.util.List;
import LLDCarRentalSystem.Model.Location;
import LLDCarRentalSystem.Model.Reservation.Reservation;
import LLDCarRentalSystem.Model.User;
import LLDCarRentalSystem.Model.Vehicle.Vehicle;
import LLDCarRentalSystem.Model.Vehicle.VehicleType;

public class Store {

    public int storeID;
    Location storeLocation;
    VehicleInventoryMgmt vehicleInventory;
    List<Reservation> reservations = new ArrayList<>();


    public List<Vehicle> getVehicles(VehicleType VehicleType){

        return vehicleInventory.getVehicles(VehicleType);
        
    }

    //addVehicles, update vehicles, use inventory management to update those.


    public void setVehicles( List<Vehicle> vehicles) {
        vehicleInventory = new VehicleInventoryMgmt(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {

        //take out the reservation from the list and call complete the reservation method.
        return true;
    }

    //update reservation
    
    
}
