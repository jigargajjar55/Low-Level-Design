package LLDCarRentalSystem.Model.Reservation;

import java.util.Date;

import LLDCarRentalSystem.Model.Location;
import LLDCarRentalSystem.Model.User;
import LLDCarRentalSystem.Model.Vehicle.Vehicle;

public class Reservation {
    public int reservationID;
    User user;
    Location location;
    Vehicle vehicle;
    Date bookingDate;
    Date bookedFromDate;
    Date bookedTillDate;
    ReservationStatus reservationStatus;

    public int createReserve(User user, Vehicle vehicle) {

        // generate new id
        reservationID = 12232;
        this.user = user;
        this.vehicle = vehicle;

        reservationStatus = ReservationStatus.SCHEDULED;

        return reservationID;
    }

}
