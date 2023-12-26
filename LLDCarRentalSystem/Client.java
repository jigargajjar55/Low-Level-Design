package LLDCarRentalSystem;

import LLDCarRentalSystem.Controller.VehicleRentalSystem;
import LLDCarRentalSystem.Model.Bill;
import LLDCarRentalSystem.Model.Location;
import LLDCarRentalSystem.Model.Payment;
import LLDCarRentalSystem.Model.User;
import LLDCarRentalSystem.Model.Reservation.Reservation;
import LLDCarRentalSystem.Model.Store.Store;
import LLDCarRentalSystem.Model.Vehicle.Car;
import LLDCarRentalSystem.Model.Vehicle.Vehicle;
import LLDCarRentalSystem.Model.Vehicle.VehicleType;

import java.util.*;

public class Client {

    public static void main(String args[]) {

        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(VehicleType.CAR, vehicles);

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(stores, users);

        // 0. User comes
        User user = users.get(0);

        // 1. user search store based on location
        Location location = new Location(403012, "Bangalore", "Karnataka", "India");
        Store store = rentalSystem.getStore(location);

        // 2. get All vehicles you are interested in (based upon different filters)
        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);

        // 3.reserving the particular vehicle
        Reservation reservation = store.createReservation(storeVehicles.get(0), users.get(0));

        // 4. generate the bill
        Bill bill = new Bill(reservation);

        // 5. make payment
        Payment payment = new Payment();
        payment.payBill(bill);

        // 6. trip completed, submit the vehicle and close the reservation
        store.completeReservation(reservation.reservationID);

    }

    public static List<Vehicle> addVehicles() {

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleID(1);
        vehicle1.setVehicleType(VehicleType.CAR);

        Vehicle vehicle2 = new Car();
        vehicle1.setVehicleID(2);
        vehicle1.setVehicleType(VehicleType.CAR);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;
    }

    public static List<User> addUsers() {

        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);

        users.add(user1);
        return users;
    }

    public static List<Store> addStores(VehicleType vehicleType, List<Vehicle> vehicles) {

        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.storeID = 1;
        store1.setVehicles(vehicles);

        stores.add(store1);
        return stores;
    }

}
